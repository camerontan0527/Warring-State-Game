package comp1110.ass2;


import javafx.util.Pair;

import javax.print.DocFlavor;
import java.net.Inet4Address;
import java.util.*;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * This class provides the text interface for the Warring States game
 */
public class WarringStatesGame {
    static char[][] row = {{'A', 'G', 'M', 'S', 'Y', '4'},
            {'B', 'H', 'N', 'T', 'Z', '5'},
            {'C', 'I', 'O', 'U', '0', '6'},
            {'D', 'J', 'P', 'V', '1', '7'},
            {'E', 'K', 'Q', 'W', '2', '8'},
            {'F', 'L', 'R', 'X', '3', '9'}};
    static char[][] column = {{'A', 'B', 'C', 'D', 'E', 'F'},
            {'G', 'H', 'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P', 'Q', 'R'},
            {'S', 'T', 'U', 'V', 'W', 'X'},
            {'Y', 'Z', '0', '1', '2', '3'},
            {'4', '5', '6', '7', '8', '9'}};
    static String[] row_str = {"AGMSY4", "BHNTZ5",
            "CIOU06", "DJPV17", "EKQW28", "FLRX39"};
    static String[] col_str = {"ABCDEF", "GHIJKL",
            "MNOPQR", "STUVWX", "YZ0123", "456789"};


    WarringStatesGame(char[][] row, char[][] column) {
        this.column = column;
        this.row = row;
    }

    static ArrayList<String>[] supporter_lst = new ArrayList[36];
    static ArrayList<Character> possible_move =
            new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
                    '4', '5', '6', '7', '8', '9'));
    static ArrayList<Character> possible_kingdom =
            new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g'));
    static ArrayList<Character> possible_number_ofKing =
            new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7'));

    /**
     * Determine whether a card placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range a..g (kingdom) or is z (Zhang Yi)
     * - the second character is numeric, and is a valid character number for that kingdom (9 for Zhang Yi)
     * - the third character is in the range A .. Z or 0..9 (location)
     *
     * @param cardPlacement A string describing a card placement
     * @return true if the card placement is well-formed
     */
    static boolean isCardPlacementWellFormed(String cardPlacement) {
        // FIXME Task 2: determine whether a card placement is well-formed
        char[] arr = cardPlacement.toCharArray(); //converts the cardPlacement set into an array of characters
        //if the third element in the char array is A and Z or 0 and 9.
        if ((arr[2] >= 'A' && arr[2] <= 'Z') || (arr[2] >= '0' && arr[2] <= '9')) //checks if the characters are in range
            if (arr[0] == 'a' && arr[1] >= '0' && arr[1] <= '7') {//checks if the kingdom is a and character number is valid  (0 and 7)
                return true;// returns true if the above statement is true.
            } else if (arr[0] == 'b' && arr[1] >= '0' && arr[1] <= '6') {
                return true;
            } else if (arr[0] == 'c' && arr[1] >= '0' && arr[1] <= '5') {
                return true;
            } else if (arr[0] == 'd' && arr[1] >= '0' && arr[1] <= '4') {
                return true;
            } else if (arr[0] == 'e' && arr[1] >= '0' && arr[1] <= '3') {
                return true;
            } else if (arr[0] == 'f' && arr[1] >= '0' && arr[1] <= '2') {
                return true;
            } else if (arr[0] == 'g' && arr[1] >= '0' && arr[1] <= '1') {
                return true;
            } else if (arr[0] == 'z' && arr[1] == '9') {
                return true;
            } else {
                return false;
            }
        else {
            return false;
        }

    }

    /**
     * Determine whether a placement string is well-formed:
     * - it consists of exactly N three-character card placements (where N = 1 .. 36);
     * - each card placement is well-formed
     * - no card appears more than once in the placement
     * - no location contains more than one card
     *
     * @param placement A string describing a placement of one or more cards
     * @return true if the placement is well-formed
     */
    static boolean isPlacementWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement is well-formed
        //need to check if all cards are placed on the board once
        //need to check if the locations are all different (0-9 numbers no repeats)
        //can use if statements
        //can create an array of string (3char)
        // or
        //create two arrays
        // one with the location values and the other with the card type
        if (placement == null || placement == "") {
            return false;
        }
        String[] ar = placementArray(placement);
        if ((placement.length()) % 3 != 0) { //checks if there are three pairs of char for each char
            return false;
        }
        for (int i = 0; i < ar.length; i++) { //goes through the array of cards looking at each char
            if (isCardPlacementWellFormed(ar[i]) == false) {//if the card placement is not well formed
                return false;
            }
        }
        for (int j = 0; j < ar.length - 1; j++) {//goes through each char in the array
            for (int i = j + 1; i < ar.length; i++) {//goes through each char in array (one after j)
                if (ar[j] == ar[i]) { //if the two chars are equal false is returned
                    return false;
                }
            }
        }
        for (int m = 0; m < ar.length - 1; m++) {//goes through each char in the array
            for (int n = m + 1; n < ar.length; n++) {//goes through each char in the array (one after m)
                if (ar[m].charAt(2) == ar[n].charAt(2)) {//checks if there are duplicates of locations in the card
                    return false;
                }
            }
        }
        for (int m = 0; m < ar.length - 1; m++) {//does through each char in the array
            for (int n = m + 1; n < ar.length; n++) {//goes through each char in the array (one after m)
                if ((ar[m].charAt(0) == ar[n].charAt(0)) && (ar[m].charAt(1) == ar[n].charAt(1))) {//checks if there are duplicates of the card in the array
                    return false;
                }
            }
        }
        return true;
    }

    // below is task 5
    static String zhangLocation(String placement) {
        String[] ar = placement.split("(?<=\\G...)");
        String zhangLocation = "";
        for (String elem : ar) {
            if (elem.charAt(0) == 'z' && elem.charAt(1) == '9') {
                zhangLocation = elem; // Zhang's current card (Z9_)
            }
        }
        return zhangLocation;
    }
    static String[] placementArray (String placement){
        String[] ar = placement.split("(?<=\\G...)");
        return ar;
    }

    /**
     * Determine whether a given move is legal given a provided valid placement:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the location is in the same row or column of the grid as Zhang Yi's current position; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     * there are no other cards along the line from the same kingdom as the chosen card
     * that are further away from Zhang Yi.
     *
     * @param placement    the current placement string
     * @param locationChar a location for Zhang Yi to move to
     * @return true if Zhang Yi may move to that location
     */
    public static boolean isMoveLegal(String placement, char locationChar) {
        // FIXME Task 5: determine whether a given move is legal
        // set each row/column an array or string
        //checking if location is in range (if statements)
        // String[] p = placement.split("(?<=\\G...)");
        // if (locationChar<0 &&locationChar>9){
        // return false;
        //check through the placement string (use for loop)
        //check if the location char is in the placement string (use for statements)
        //check if the location is in the column/row ( as z9)
        // need to look at the current location and check if the location fo r Zhang yi to move to is in the same colum/row
        String[] ar = placementArray(placement);
        if (locationChar < '0' || (locationChar > '9' && locationChar < 'A') || locationChar > 'Z') {
            return false;
        }
        Character[] thirdChar = new Character[ar.length]; //check if there's a card at chosen location
        for (int i = 0; i < ar.length; i++) {
            thirdChar[i] = ar[i].charAt(2);
        }
        if ((Arrays.asList(thirdChar).contains(locationChar)) == false) {
            return false;
        }
        String locationCard = "";
        for (String elem : ar) {
            if (elem.charAt(2) == locationChar) {
                locationCard = elem; // location's current card (_ _ locationChar)
            }
        }
        int rowIndex = 0;  // return the row where zhang is
        for (char[] elem : row) {
            if (new String(elem).contains(String.valueOf(zhangLocation(placement).charAt(2)))) {
                rowIndex = Arrays.asList(row).indexOf(elem);
            }
        }
        int columnIndex = 0;  // return the column where zhang is
        for (char[] elem : column) {
            if (new String(elem).contains(String.valueOf(zhangLocation(placement).charAt(2)))) {
                columnIndex = Arrays.asList(column).indexOf(elem);
            }
        }
        int rowLocationIndex = 0;  // return the row where locationChar is
        for (char[] elem : row) {
            if (new String(elem).contains(String.valueOf(locationCard.charAt(2)))) {
                rowLocationIndex = Arrays.asList(row).indexOf(elem);
            }
        }
        int columnLocationIndex = 0;  // return the column where locationChar is
        for (char[] elem : column) {
            if (new String(elem).contains(String.valueOf(locationCard.charAt(2)))) {
                columnLocationIndex = Arrays.asList(column).indexOf(elem);
            }
        }
        if ((rowIndex == rowLocationIndex) && (columnIndex == columnLocationIndex)) {
            return false;
        }
        if ((rowIndex != rowLocationIndex) && (columnIndex != columnLocationIndex)) {
            return false;
        }
        ArrayList<String> cardAtsameRow = new ArrayList<>(); // return a List of cardString at the same row
        char[] rowPosition = row[rowIndex]; // return all the locationChar of zhang's row
        for (String elem : ar) {
            for (int i = 0; i < 6; i++) {
                if (elem.charAt(2) == rowPosition[i])
                    cardAtsameRow.add(elem);
            }
        }
        java.util.Collections.sort(cardAtsameRow, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return possible_move.indexOf(s1.charAt(2)) - possible_move.indexOf(s2.charAt(2));//comparision
            }
        });
        ArrayList<String> cardAtsameColumn = new ArrayList<>(); // return a List of cardString at the same column
        char[] columnPosition = column[columnIndex]; // return all the locationChar of zhang's column
        for (String elem : ar) {
            for (int i = 0; i < 6; i++) {
                if (elem.charAt(2) == columnPosition[i])
                    cardAtsameColumn.add(elem);
            }
        }
        java.util.Collections.sort(cardAtsameColumn, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return possible_move.indexOf(s1.charAt(2)) - possible_move.indexOf(s2.charAt(2));//comparision
            }
        });
        ArrayList<String> sameRowKingdom = new ArrayList<>(); // return the card with same kingdom at same row
        for (int i = 0; i < cardAtsameRow.size(); i++) {
            if ((cardAtsameRow.get(i).charAt(0)) == locationCard.charAt(0)) {
                sameRowKingdom.add(cardAtsameRow.get(i));
            }
        }
        ArrayList<String> sameColumnKingdom = new ArrayList<>(); // return the card with same kingdom at same column
        for (int i = 0; i < cardAtsameColumn.size(); i++) {
            if ((cardAtsameColumn.get(i).charAt(0)) == locationCard.charAt(0)) {
                sameColumnKingdom.add(cardAtsameColumn.get(i));
            }
        }
        if (rowIndex == rowLocationIndex) { // they're in the same row
            if (sameRowKingdom.size() == 1) {
                return true;
            } else if ((Arrays.asList(cardAtsameRow).get(0).indexOf(zhangLocation(placement))) < ((Arrays.asList(cardAtsameRow)).get(0).indexOf(locationCard))) {
                for (int i = 0; i < sameRowKingdom.size(); i++) {
                    if (locationCard != sameRowKingdom.get(sameRowKingdom.size() - 1)) {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = 0; i < sameRowKingdom.size(); i++) {
                    if (locationCard != sameRowKingdom.get(0)) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            if (columnIndex == columnLocationIndex) { // they're in the same row
                if (sameColumnKingdom.size() == 1) {
                    return true;
                } else if ((Arrays.asList(cardAtsameColumn).get(0).indexOf(zhangLocation(placement))) < ((Arrays.asList(cardAtsameColumn)).get(0).indexOf(locationCard))) {
                    for (int i = 0; i < sameColumnKingdom.size(); i++) {
                        if (locationCard != sameColumnKingdom.get(sameColumnKingdom.size() - 1)) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    for (int i = 0; i < sameColumnKingdom.size(); i++) {
                        if (locationCard != sameColumnKingdom.get(0)) {
                            return false;
                        }
                    }
                }
            }
            return true;

        }
    }


    /**
     * Determine whether a move sequence is valid.
     * To be valid, the move sequence must be comprised of 1..N location characters
     * showing the location to move for Zhang Yi, and each move must be valid
     * given the placement that would have resulted from the preceding sequence
     * of moves.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @return True if the placement sequence is valid
     */
    public static boolean isMoveSequenceValid(String setup, String moveSequence) {

        // FIXME Task 6: determine whether a placement sequence is valid
        // check if the length of the set up = 36
        //needs to call isMoveLegal function
        // this function checks the isMoveLegal function multiple times
        //  check if the next move is in the same column/row as the previous one
        //if one move passes, the current move for the next move will be the move which passed the is current location
        String placement = setup;
        String[] ar = placementArray(placement);
        ArrayList<String> board = new ArrayList<>();
        char location = ' '; //initialise
        char kingdom = ' '; // initialise
        String zhang_location = "";
        int row_index = row.length; // inisitialise to 6
        int col_index = column.length; // initialise to 6
        String new_character = "";
        String new_location = "";

        for (int i = 0; i < moveSequence.length(); i++) {
            ArrayList<String> array = new ArrayList<>();
            for (int j = 0; j < placement.length(); j = j + 3) {
                array.add(placement.substring(j, j + 3));
            }
            location = moveSequence.charAt(i);

            if (!(isMoveLegal(placement, location)))
                return false; // if the move isn't legal then return false

            for (String elem : array) { //extract out the zhangyi location
                if (elem.charAt(0) == 'z' && elem.charAt(1) == '9')
                    zhang_location = elem;
            }
            placement = placement.replace(zhang_location, ""); //update zhangyi location after every move
            for (String elem : array) { // put zhang yi at his next position
                if (elem.charAt(2) == location) {
                    kingdom = elem.charAt(0);
                    new_character = elem;
                }
            }
            new_location = "z9" + location;
            placement = placement.replace(new_character, new_location); //update new placement string
            for (int m = 0; m < row.length; m++) {
                for (int n = 0; n < row[m].length; n++) {
                    if (zhang_location.charAt(2) == row[m][n])
                        row_index = m;
                }
            }
            for (int m = 0; m < column.length; m++) {
                for (int n = 0; n < column[m].length; n++) {
                    if (zhang_location.charAt(2) == column[m][n])
                        col_index = m;
                }
            }
            String mid = "";
            ArrayList<String> remove_elem = new ArrayList<>();
            if (sameRow(location, row_index)) {
                int ri1 = row_str[row_index].indexOf(zhang_location.charAt(2));
                int ri2 = row_str[row_index].indexOf(location);
                if (ri1 > ri2)
                    mid = row_str[row_index].substring(ri2 + 1, ri1);
                else
                    mid = row_str[row_index].substring(ri1 + 1, ri2);
                for (int m = 0; m < mid.length(); m++) {
                    for (String elem : array) {
                        if (elem.charAt(2) == mid.charAt(m) && elem.charAt(0) == kingdom)
                            remove_elem.add(elem);
                    }
                }
                for (String elem : remove_elem) {
                    placement = placement.replace(elem, "");
                }
            } else if (sameColumn(location, col_index)) {
                int ci1 = col_str[col_index].indexOf(zhang_location.charAt(2));
                int ci2 = col_str[col_index].indexOf(location);
                if (ci1 > ci2)
                    mid = col_str[col_index].substring(ci2 + 1, ci1);
                else
                    mid = col_str[col_index].substring(ci1 + 1, ci2);
                for (int m = 0; m < mid.length(); m++) {
                    for (String elem : array) {
                        if (elem.charAt(2) == mid.charAt(m) && elem.charAt(0) == kingdom)
                            remove_elem.add(elem);
                    }
                }
                for (String elem : remove_elem) {
                    placement = placement.replace(elem, "");
                }
            }
        }
        return true;
    }

    static boolean sameRow(char loc, int i) { // check if are on the same row
        for (int j = 0; j < row[i].length; j++) {
            if (row[i][j] == loc)
                return true;
        }
        return false;
    }

    static boolean sameColumn(char loc, int i) { // check if are on the same column
        for (int j = 0; j < column[i].length; j++) {
            if (column[i][j] == loc)
                return true;
        }
        return false;
    }


    //updates setup deleting card of move made
    public static String updateSetup(String l, String setup) { // a function to update setUp string after every move
        String[] ar = setup.split("(?<=\\G...)");
        List<String> setupList = new ArrayList<>();
        Collections.addAll(setupList, ar);
        setupList.remove(cardAtLocation(l, setup) + l);
        String array[] = new String[setupList.size()];
        for (int j = 0; j < setupList.size(); j++) {
            array[j] = setupList.get(j);
        }
        StringBuilder builder = new StringBuilder();
        for (String s : array) {
            builder.append(s);
        }
        String str = builder.toString();
        return str;
    }


    //finds the card at given location
    public static String cardAtLocation(String l, String setup) { // function to finds the card (three character) based on specific location
        String[] ar = setup.split("(?<=\\G...)");
        String card = "";
        for (int i = 0; i < ar.length; i++) {

            if (l.equals("" + ar[i].charAt(2))) {
                card = card + ar[i].charAt(0) + ar[i].charAt(1);
                break;
            }
        }
        if (card.equals("")) {
            System.out.print("Card is empty");
        }
        return card;

    }

    //sorts supporters into ascending order
    public static String sortString(String s) { //sort
        String[] a = s.split("(?<=\\G..)");
        Arrays.sort(a);
        StringBuilder builder = new StringBuilder();
        for (String x : a) {
            builder.append(x);
        }
        String str = builder.toString();
        return str;
    }

    //   https://stackoverflow.com/questions/17993729/split-a-string-after-each-two-characters
//retruns true if Zhang is moving within a row
    static boolean isMoveWithinRow(String l, String l2) { // check if the next move is in the same row as zhang yi (game rules required)
        boolean x = false;
        for (int i = 0; i < row_str.length; i++) {
            if (row_str[i].contains(l) && row_str[i].contains(l2)) {
                return true;
            }
        }
        return x;
    }

    //returns true if Zhang is moving within a column
    static boolean isMoveWithinCol(String l, String l2) {// check if the next move is in the same row as zhang yi (game rules required)
        boolean x = false;
        for (int i = 0; i < col_str.length; i++) {
            if (col_str[i].contains(l) && col_str[i].contains(l2)) {
                return true;
            }
        }
        return x;
    }

    //finds the colum/row Zhang is making its move in
    public static String extractColOrRow(String l, String l2) {
        String colOrRow = "";
        if (isMoveWithinCol(l, l2) == true) {
            for (int i = 0; i < col_str.length; i++) {
                if (col_str[i].contains(l) && col_str[i].contains(l2)) {
                    colOrRow = colOrRow + col_str[i];
                    break;
                }
            }
        } else if (isMoveWithinRow(l, l2) == true) {
            for (int i = 0; i < row_str.length; i++) {
                if (row_str[i].contains(l) && row_str[i].contains(l2)) {
                    colOrRow = colOrRow + row_str[i];
                    break;
                }
            }
        }
        return colOrRow;
    }

    //finds the locations Zhang passes by to get to location x
    //l=current location, l2=location Zhang moves to

    public static String possibleCardsTaken(String l, String l2) { // return all the posibilitied
        String possibleCards = "";
        try {
            String rowOrCol = extractColOrRow(l, l2);
            if (!rowOrCol.isEmpty()) {
                int startIndex;
                int finishIndex;

                if (rowOrCol.indexOf(l) > rowOrCol.indexOf(l2)) {
                    startIndex = rowOrCol.indexOf(l2);
                    finishIndex = rowOrCol.indexOf(l);
                } else {
                    startIndex = rowOrCol.indexOf(l);
                    finishIndex = rowOrCol.indexOf(l2);
                }

                if (startIndex - finishIndex == 1) {
                    possibleCards = "";
                } else
                    for (int i = startIndex + 1; i < finishIndex; i++) {
                        possibleCards = possibleCards + rowOrCol.charAt(i);
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return possibleCards;
    }

    //finds the location for Zhang
    public static String positionofZhang(String setup) {
        String[] ar = setup.split("(?<=\\G...)");
        String location = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].charAt(0) == 'z') {
                location = ar[i].substring(2, ar[i].length());

                break;
            }
        }
        return location;
    }

    //generates a string of cards which are collected as Zhang moves to a certain location
    //MAY BE AN ISSUE IN THIS FUNCTION
    public static Pair<String, String> possibleCollect(String setup, String moveSequence, int i) {
        String possibleC = "";
        String supporters = "";
        if (i == 0) {
            String currentCardPosition = positionofZhang(setup);
            String moveCardPosition = "" + moveSequence.charAt(i);
            possibleC = possibleC + possibleCardsTaken(currentCardPosition, moveCardPosition);
        } else possibleC = possibleCardsTaken("" + moveSequence.charAt(i - 1), "" + moveSequence.charAt(i));

        if (possibleC != "") {

            for (int j = 0; j < possibleC.length(); j++) {
                String a = "" + moveSequence.charAt(i);
                String b = "" + possibleC.charAt(j);
                if (!cardAtLocation(a, setup).equals("") && !cardAtLocation(b, setup).equals("")) {
                    String tempA = "" + cardAtLocation(a, setup).charAt(0);
                    String tempB = "" + cardAtLocation(b, setup).charAt(0);
                    if (tempA.equals(tempB)) {
                        supporters = supporters + cardAtLocation("" + moveSequence.charAt(j), setup);
                    } else continue;
                }
            }
        }
        return new Pair<>(supporters, setup);
    }

    //Determines if another player has collected the card
    //MAY BE AN ISSUE IN THIS FUNCTION
    public static boolean isCardAlreadyExistInOtherPLayer(String possibleCards, String p1, String p2, String p3) {
        String[] a = possibleCards.split("(?<=\\G..)");
        String[] b = p1.split("(?<=\\G..)");
        String[] c = p2.split("(?<=\\G..)");
        String[] d = p3.split("(?<=\\G..)");
        boolean isCardExist = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (!a[i].isEmpty() && !b[j].isEmpty() && a[i].equals(b[j])) {
                    isCardExist = true;
                    break;
                }
            }
            for (int k = 0; k < c.length; k++) {
                if (!a[i].isEmpty() && !c[k].isEmpty() && a[i].equals(c[k])) {
                    isCardExist = true;
                    break;
                }
            }
            for (int l = 0; l < d.length; l++) {
                if (!a[i].isEmpty() && !d[l].isEmpty() && a[i].equals(d[l])) {
                    isCardExist = true;
                    break;
                }
            }

        }


        return isCardExist;
    }

    /**
     * Get the list of supporters for the chosen player, given the provided
     * setup and move sequence.
     * The list of supporters is a sequence of two-character card IDs, representing
     * the cards that the chosen player collected by moving Zhang Yi.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @param playerId     the player number for which to get the list of supporters, [0..(numPlayers-1)]
     * @return the list of supporters for the given player
     */

    public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
        // FIXME Task 7: get the list of supporters for  a given player after a sequence of moves


        ArrayList<String> ID_0 = new ArrayList<>();
        ArrayList<String> ID_1 = new ArrayList<>();
        ArrayList<String> ID_2 = new ArrayList<>();
        ArrayList<String> ID_3 = new ArrayList<>();


        String[] set = setup.split("(?<=\\G...)"); //separate setup String into array of (every three char)
        ArrayList<String> setLst = new ArrayList<>(); // change the setup String array into arrayList
        for (String elem : set) {
            setLst.add(elem);
        }


        char zhang_initial = 0; // return the initial position of zhang (one character)
        for (String elem : set) {
            if (elem.charAt(0) == 'z') {
                zhang_initial = elem.charAt(2);
            }
        }
        int zhang_initial_column = 0;
        int zhang_initial_row = 0;
        for (char[] elem : row) { // return zhang initial row index
            if (new String(elem).contains(String.valueOf(zhang_initial))) {
                zhang_initial_row = Arrays.asList(row).indexOf(elem);
            }
        }
        for (char[] elem : column) { // return zhang initial column index
            if (new String(elem).contains(String.valueOf(zhang_initial))) {
                zhang_initial_column = Arrays.asList(column).indexOf(elem);
            }
        }


        int rowIndex_mov = 0;
        int columnIndex_mov = 0;
        int rowIndex_pre = 0;
        int columnIndex_pre = 0;

        //  ArrayList<String>[] supporter_lst = new ArrayList[36]; // an array of arrayList (the supporters after each movement)
        for (int i = 0; i < supporter_lst.length; i++) { // each element in array is an arrayList
            supporter_lst[i] = new ArrayList<String>();
        }
        for (int i = 0; i < moveSequence.length(); i++) { // go through every move
            String target = ""; // the card we are moving to (three character)
            for (String elem : set) {
                if (elem.charAt(2) == moveSequence.charAt(i)) {
                    target = elem;
                }
            }

            for (char[] elem : row) { // the row index of target
                if (new String(elem).contains(String.valueOf(moveSequence.charAt(i)))) {
                    rowIndex_mov = Arrays.asList(row).indexOf(elem);
                }
            }

            for (char[] elem : column) { // the column index of target
                if (new String(elem).contains(String.valueOf(moveSequence.charAt(i)))) {
                    columnIndex_mov = Arrays.asList(column).indexOf(elem);
                }
            }


            if (i == 0) { // the first move, so we need to compare the move position with the zhang's initial position
                if (rowIndex_mov == zhang_initial_row) { // on the same row
                    if (row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)) < row_str[rowIndex_mov].indexOf(zhang_initial)) { // moving right
                        // the row range between zhang's position and target position
                        String row_range = row_str[rowIndex_mov].substring(row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)), row_str[rowIndex_mov].indexOf(zhang_initial));
                        for (String elem : setLst) { // check if there's any other card with the same kingdom between zhang's position and target positoin
                            if (row_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem); // add all the cards, between row range, with the same kingdom as target into supporter list
                            }
                        }
                    } else { //moving left
                        String row_range = row_str[rowIndex_mov].substring(row_str[rowIndex_mov].indexOf(zhang_initial), row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)));
                        supporter_lst[i].add(target); // add the target into the supporter_lst first, because it's moving left, and the substring (zhang's initial, target) doesn't include target
                        for (String elem : setLst) {// check if there's any other card with the same kingdom between zhang's position and target positoin
                            if (row_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);// add all the cards, between row range, with the same kingdom as target into supporter list
                            }
                        }
                    }
                } else { // on the same column
                    if (col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)) < col_str[columnIndex_mov].indexOf(zhang_initial)) { // moving up
                        String column_range = col_str[columnIndex_mov].substring(col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)), col_str[columnIndex_mov].indexOf(zhang_initial));
                        for (String elem : setLst) {
                            if (column_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    } else {// moving down
                        String column_range = col_str[columnIndex_mov].substring(col_str[columnIndex_mov].indexOf(zhang_initial), col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)));
                        supporter_lst[i].add(target);
                        for (String elem : setLst) {
                            if (column_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    }
                }
            } else {// other than first move, compare the target move position with the previous move position
                String pre = "";
                for (String elem : set) { // the position of the previous movement
                    if (elem.charAt(2) == moveSequence.charAt(i - 1)) {
                        pre = elem;
                    }
                }
                for (char[] elem : row) { // the row index of previous movement
                    if (new String(elem).contains(String.valueOf(moveSequence.charAt(i - 1)))) {
                        rowIndex_pre = Arrays.asList(row).indexOf(elem);
                    }
                }
                for (char[] elem : column) { // the column index of previous movement
                    if (new String(elem).contains(String.valueOf(moveSequence.charAt(i - 1)))) {
                        columnIndex_pre = Arrays.asList(column).indexOf(elem);
                    }
                }


                if (rowIndex_mov == rowIndex_pre) { // on same row
                    if (row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)) < row_str[rowIndex_mov].indexOf(pre.charAt(2))) {
                        String row_range = row_str[rowIndex_mov].substring(row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)), row_str[rowIndex_mov].indexOf(pre.charAt(2)));
                        for (String elem : setLst) {
                            if (row_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    } else {
                        String row_range = row_str[rowIndex_mov].substring(row_str[rowIndex_mov].indexOf(pre.charAt(2)), row_str[rowIndex_mov].indexOf(moveSequence.charAt(i)));
                        supporter_lst[i].add(target);
                        for (String elem : setLst) {
                            if (row_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    }
                } else { // on same column
                    if (col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)) < col_str[columnIndex_mov].indexOf(pre.charAt(2))) { // moving up
                        String column_range = col_str[columnIndex_mov].substring(col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)), col_str[columnIndex_mov].indexOf(pre.charAt(2)));
                        for (String elem : setLst) {
                            if (column_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    } else { // moving down
                        String column_range = col_str[columnIndex_mov].substring(col_str[columnIndex_mov].indexOf(pre.charAt(2)), col_str[columnIndex_mov].indexOf(moveSequence.charAt(i)));
                        supporter_lst[i].add(target);
                        for (String elem : setLst) {
                            if (column_range.contains(elem.charAt(2) + "") && elem.charAt(0) == target.charAt(0)) {
                                supporter_lst[i].add(elem);
                            }
                        }
                    }
                }
            } // delete the card after each movement ( to avoid getting replicate supporters after each movement
            for (String elem : supporter_lst[i]) {
                setLst.remove(elem);
            }

        }
        if (numPlayers == 2) { // if 2 players are playing
            for (int i = 0; i < supporter_lst.length - 1; i = i + 2) {
                for (String elem : supporter_lst[i]) {
                    ID_0.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 1]) {
                    ID_1.add(elem.substring(0, 2));
                }
            }
        }
        if (numPlayers == 3) { // if 3 players are playing
            for (int i = 0; i < supporter_lst.length - 2; i = i + 3) {
                for (String elem : supporter_lst[i]) {
                    ID_0.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 1]) {
                    ID_1.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 2]) {
                    ID_2.add(elem.substring(0, 2));
                }
            }
        }
        if (numPlayers == 4) { // if 4 players are playing
            for (int i = 0; i < supporter_lst.length - 3; i = i + 4) {
                for (String elem : supporter_lst[i]) {
                    ID_0.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 1]) {
                    ID_1.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 2]) {
                    ID_2.add(elem.substring(0, 2));
                }
                for (String elem : supporter_lst[i + 3]) {
                    ID_3.add(elem.substring(0, 2));
                }
            }
        }
        // sort the list base on charAt(0) which is the kingdom, and charAtcharAt(1) which is the number in each kingdom

        java.util.Collections.sort(ID_0, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if ((possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0)) == 0)) {
                    return possible_number_ofKing.indexOf(s1.charAt(1)) - possible_number_ofKing.indexOf(s2.charAt(1));
                } else {
                    return possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0));//comparision
                }
            }
        });
        java.util.Collections.sort(ID_1, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if ((possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0)) == 0)) {
                    return possible_number_ofKing.indexOf(s1.charAt(1)) - possible_number_ofKing.indexOf(s2.charAt(1));
                } else {
                    return possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0));//comparision
                }
            }
        });
        java.util.Collections.sort(ID_2, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if ((possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0)) == 0)) {
                    return possible_number_ofKing.indexOf(s1.charAt(1)) - possible_number_ofKing.indexOf(s2.charAt(1));
                } else {
                    return possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0));//comparision
                }
            }
        });
        java.util.Collections.sort(ID_3, new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if ((possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0)) == 0)) {
                    return possible_number_ofKing.indexOf(s1.charAt(1)) - possible_number_ofKing.indexOf(s2.charAt(1));
                } else {
                    return possible_kingdom.indexOf(s1.charAt(0)) - possible_kingdom.indexOf(s2.charAt(0));//comparision
                }
            }
        });

        if (numPlayers == 2) {
            if (playerId == 0) {
                return String.join("", ID_0);
            } else {
                return String.join("", ID_1);
            }
        }
        if (numPlayers == 3) {
            if (playerId == 0) {
                return String.join("", ID_0);
            } else if (playerId == 1) {
                return String.join("", ID_1);
            } else {
                return String.join("", ID_2);

            }
        } else {
            if (playerId == 0) {
                return String.join("", ID_0);
            } else if (playerId == 1) {
                return String.join("", ID_1);
            } else if (playerId == 2) {
                return String.join("", ID_2);
            } else {
                return String.join("", ID_3);
            }
        }
    }
// below is task8

    //count the number of cards collected in the specific kingdom
    //hashmap generated which has the player id as the key and the value is an array list which contains the number of cards collected for each kingdom
    //index 0=Qin cards, index1=Qi cards, index2=Chu cards, index3=Zhao cards, index4=Han cards, index5=wei cards, index6= Yan cards

    public static HashMap<Integer, ArrayList<Integer>> numberOfCardsForEachKingdom(String supporters, int playerID) {
        String[] a = supporters.split("(?<=\\G..)");
        List<String> supporterList = Arrays.asList(a);
        HashMap<Integer, ArrayList<Integer>> numberOfCardsForPlayer = new HashMap<>();
        ArrayList<Integer> numberInKingdom = new ArrayList<>();
        int counterQin = 0;
        int counterQi = 0;
        int counterChu = 0;
        int counterZhao = 0;
        int counterHan = 0;
        int counterWei = 0;
        int counterYan = 0;
        if (supporters != "") {
            for (int i = 0; i < supporterList.size(); i++) {
                if (supporterList.get(i).charAt(0) == 'a') {
                    counterQin++;
                } else if (supporterList.get(i).charAt(0) == 'b') {
                    counterQi++;
                } else if (supporterList.get(i).charAt(0) == 'c') {
                    counterChu++;
                } else if (supporterList.get(i).charAt(0) == 'd') {
                    counterZhao++;
                } else if (supporterList.get(i).charAt(0) == 'e') {
                    counterHan++;
                } else if (supporterList.get(i).charAt(0) == 'f') {
                    counterWei++;
                } else if (supporterList.get(i).charAt(0) == 'g') {
                    counterYan++;
                }
            }
        }
        numberInKingdom.add(0, counterQin);
        numberInKingdom.add(1, counterQi);
        numberInKingdom.add(2, counterChu);
        numberInKingdom.add(3, counterZhao);
        numberInKingdom.add(4, counterHan);
        numberInKingdom.add(5, counterWei);
        numberInKingdom.add(6, counterYan);
        numberOfCardsForPlayer.put(playerID, numberInKingdom);

        return numberOfCardsForPlayer;

    }


    /**
     * Given a setup and move sequence, determine which player controls the flag of each kingdom
     * after all the moves in the sequence have been played.
     *
     * @param setup        A placement string representing the board setup
     * @param moveSequence a string of location characters representing a sequence of moves
     * @param numPlayers   the number of players in the game, must be in the range [2..4]
     * @return an array containing the player ID who controls each kingdom, where
     * - element 0 contains the player ID of the player who controls the flag of Qin
     * - element 1 contains the player ID of the player who controls the flag of Qi
     * - element 2 contains the player ID of the player who controls the flag of Chu
     * - element 3 contains the player ID of the player who controls the flag of Zhao
     * - element 4 contains the player ID of the player who controls the flag of Han
     * - element 5 contains the player ID of the player who controls the flag of Wei
     * - element 6 contains the player ID of the player who controls the flag of Yan
     * If no player controls a particular house, the element for that house will have the value -1.
     */
    public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
        // FIXME Task 8: determine which player controls the flag of each kingdom after a given sequence of moves
        // check if the number of holding cards is equal or greater than other player
        //need to call task 7 to check which supporters the player has

        // can use compareTo to code this function
        int flags[] = new int[7];
        //    ArrayList<String>[] supporters = arraySupporters(setup, moveSequence);
        if (numPlayers == 4) {
            String id0 = getSupporters(setup, moveSequence, numPlayers, 0);
            String id1 = getSupporters(setup, moveSequence, numPlayers, 1);
            String id2 = getSupporters(setup, moveSequence, numPlayers, 2);
            String id3 = getSupporters(setup, moveSequence, numPlayers, 3);
            //creat hashmaps for the number of cards collected for each player
            HashMap<Integer, ArrayList<Integer>> player1 = numberOfCardsForEachKingdom(id0, 0);
            HashMap<Integer, ArrayList<Integer>> player2 = numberOfCardsForEachKingdom(id1, 1);
            HashMap<Integer, ArrayList<Integer>> player3 = numberOfCardsForEachKingdom(id2, 2);
            HashMap<Integer, ArrayList<Integer>> player4 = numberOfCardsForEachKingdom(id3, 3);
            //extract value of hashmap (index assigned to kingdom)
            ArrayList<Integer> player1CardList = player1.get(0);
            ArrayList<Integer> player2CardList = player2.get(1);
            ArrayList<Integer> player3CardList = player3.get(2);
            ArrayList<Integer> player4CardList = player4.get(3);

            for (int j = 0; j < player1CardList.size(); j++) {
                //creats an array list of number of cards collected for one kingdom
                ArrayList<Integer> allCardsOfOneKindom = new ArrayList<>();
                allCardsOfOneKindom.add(player1CardList.get(j));//index 0 = number of cards collected by p1
                allCardsOfOneKindom.add(player2CardList.get(j));//index 1 = number of cards collected by p2
                allCardsOfOneKindom.add(player3CardList.get(j));//index 2 = number of cards collected by p3
                allCardsOfOneKindom.add(player4CardList.get(j));//index 3 = number of cards collected by p4

                int maximumNumberOfCards = Collections.max(allCardsOfOneKindom);//finds the max number of cards collected
                boolean checkTwoOrMorePLayersHaveSameCard = false;
                String playerIDsWhoHoldSameCard = "";
                int playerWhoHoldMaxCard = -1;
                int tempCounter = 0;
                //for loop used to check which player collected the max number (note: index=player ID)
                for (int k = 0; k < allCardsOfOneKindom.size(); k++) {
                    if (allCardsOfOneKindom.get(k) == maximumNumberOfCards) {
                        if (tempCounter == 0) {
                            playerWhoHoldMaxCard = k;
                        }
                        if (playerIDsWhoHoldSameCard.equals("")) {
                            playerIDsWhoHoldSameCard = "" + k;
                        }
                        playerIDsWhoHoldSameCard = playerIDsWhoHoldSameCard + ("," + k);

                        tempCounter++;
                    }
                }
                //if more than one player holds the max number of cards
                if (tempCounter > 1) {
                    checkTwoOrMorePLayersHaveSameCard = true;
                    String currentKingdom = "";
                    if (j == 0) {
                        currentKingdom = "a";
                    } else if (j == 1) {
                        currentKingdom = "b";
                    } else if (j == 2) {
                        currentKingdom = "c";
                    } else if (j == 3) {
                        currentKingdom = "d";
                    } else if (j == 4) {
                        currentKingdom = "e";
                    } else if (j == 5) {
                        currentKingdom = "f";
                    } else if (j == 6) {
                        currentKingdom = "g";
                    }
                    flags[j] = checkLastCardInfo(supporter_lst, currentKingdom, numPlayers, playerIDsWhoHoldSameCard);//determine who picked last card from kingdom
                } else {
                    flags[j] = playerWhoHoldMaxCard;//assigns flag to player
                }

            }
        } else if (numPlayers == 3) {
            String id0 = getSupporters(setup, moveSequence, numPlayers, 0);
            String id1 = getSupporters(setup, moveSequence, numPlayers, 1);
            String id2 = getSupporters(setup, moveSequence, numPlayers, 2);

            //creat hashmaps for the number of cards collected for each player
            HashMap<Integer, ArrayList<Integer>> player1 = numberOfCardsForEachKingdom(id0, 0);
            HashMap<Integer, ArrayList<Integer>> player2 = numberOfCardsForEachKingdom(id1, 1);
            HashMap<Integer, ArrayList<Integer>> player3 = numberOfCardsForEachKingdom(id2, 2);

            //extract value of hashmap
            ArrayList<Integer> player1CardList = player1.get(0);
            ArrayList<Integer> player2CardList = player2.get(1);
            ArrayList<Integer> player3CardList = player3.get(2);


            for (int j = 0; j < player1CardList.size(); j++) {
                ArrayList<Integer> allCardsOfOneKindom = new ArrayList<>();
                allCardsOfOneKindom.add(player1CardList.get(j));
                allCardsOfOneKindom.add(player2CardList.get(j));
                allCardsOfOneKindom.add(player3CardList.get(j));


                int maximumNumberOfCards = Collections.max(allCardsOfOneKindom);
                boolean checkTwoOrMorePLayersHaveSameCard = false;
                String playerIDsWhoHoldSameCard = "";
                int playerWhoHoldMaxCard = -1;
                int tempCounter = 0;
                for (int k = 0; k < allCardsOfOneKindom.size(); k++) {
                    if (allCardsOfOneKindom.get(k) == maximumNumberOfCards) {
                        if (tempCounter == 0) {
                            playerWhoHoldMaxCard = k;
                        }
                        if (playerIDsWhoHoldSameCard.equals("")) {
                            playerIDsWhoHoldSameCard = "" + k;
                        }
                        playerIDsWhoHoldSameCard = playerIDsWhoHoldSameCard + ("," + k);

                        tempCounter++;
                    }
                }
                //if more than one player hols the max number of cards
                if (tempCounter > 1) {
                    checkTwoOrMorePLayersHaveSameCard = true;
                    String currentKingdom = "";
                    if (j == 0) {
                        currentKingdom = "a";
                    } else if (j == 1) {
                        currentKingdom = "b";
                    } else if (j == 2) {
                        currentKingdom = "c";
                    } else if (j == 3) {
                        currentKingdom = "d";
                    } else if (j == 4) {
                        currentKingdom = "e";
                    } else if (j == 5) {
                        currentKingdom = "f";
                    } else if (j == 6) {
                        currentKingdom = "g";
                    }
                    flags[j] = checkLastCardInfo(supporter_lst, currentKingdom, numPlayers, playerIDsWhoHoldSameCard);


                } else {
                    flags[j] = playerWhoHoldMaxCard;
                }
            }

        } else if (numPlayers == 2) {
            String id0 = getSupporters(setup, moveSequence, numPlayers, 0);
            String id1 = getSupporters(setup, moveSequence, numPlayers, 1);

            //creat hashmaps for the number of cards collected for each player
            HashMap<Integer, ArrayList<Integer>> player1 = numberOfCardsForEachKingdom(id0, 0);
            HashMap<Integer, ArrayList<Integer>> player2 = numberOfCardsForEachKingdom(id1, 1);

            //extract value of hashmap
            ArrayList<Integer> player1CardList = player1.get(0);
            ArrayList<Integer> player2CardList = player2.get(1);


            for (int j = 0; j < player1CardList.size(); j++) {
                ArrayList<Integer> allCardsOfOneKindom = new ArrayList<>();
                allCardsOfOneKindom.add(player1CardList.get(j));
                allCardsOfOneKindom.add(player2CardList.get(j));


                int maximumNumberOfCards = Collections.max(allCardsOfOneKindom);
                boolean checkTwoOrMorePLayersHaveSameCard = false;
                String playerIDsWhoHoldSameCard = "";
                int playerWhoHoldMaxCard = -1;
                if (maximumNumberOfCards != 0) {
                    int tempCounter = 0;
                    for (int k = 0; k < allCardsOfOneKindom.size(); k++) {
                        if (allCardsOfOneKindom.get(k) == maximumNumberOfCards) {
                            if (tempCounter == 0) {
                                playerWhoHoldMaxCard = k;
                            }
                            if (playerIDsWhoHoldSameCard.equals("")) {
                                playerIDsWhoHoldSameCard = "" + k;
                            }
                            playerIDsWhoHoldSameCard = playerIDsWhoHoldSameCard + ("," + k);

                            tempCounter++;
                        }
                    }
                    //if more than one player hols the max number of cards
                    if (tempCounter > 1) {
                        String currentKingdom = "";
                        try {
                            checkTwoOrMorePLayersHaveSameCard = true;
                            if (j == 0) {
                                currentKingdom = "a";
                            } else if (j == 1) {
                                currentKingdom = "b";
                            } else if (j == 2) {
                                currentKingdom = "c";
                            } else if (j == 3) {
                                currentKingdom = "d";
                            } else if (j == 4) {
                                currentKingdom = "e";
                            } else if (j == 5) {
                                currentKingdom = "f";
                            } else if (j == 6) {
                                currentKingdom = "g";
                            }
                            flags[j] = checkLastCardInfo(supporter_lst, currentKingdom, numPlayers, playerIDsWhoHoldSameCard);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        flags[j] = playerWhoHoldMaxCard;
                    }

                } else {
                    flags[j] = playerWhoHoldMaxCard;
                }
            }
        }

//return the array of flags
        return flags;
    }


    public static int checkLastCardInfo(ArrayList<String>[] supporter, String checkKingdom, int numOfPlayers, String playerIdsWhoHoldSameCard) {
        int playerWhoholdLastCard = -1;
        try {
            try {
                //supporters list contains the cards collected at each move
                for (int k = 0; k < supporter.length; k++) {
                    ArrayList<String> tempSupportList = supporter[k];//creates an array list for the supporters at a particular move
                    for (int l = 0; l < tempSupportList.size(); l++) {
                        if (("" + tempSupportList.get(l).charAt(0)).equals(checkKingdom)) {//if card collected at move is from the kingdom which is being checked
                            int playerIndex = k % numOfPlayers;//determines which players move it is
                            if (playerIdsWhoHoldSameCard.contains("" + playerIndex)) {// if the player index is within the string playerIdsWhoHoldSameCard
                                playerWhoholdLastCard = playerIndex; // the playerIndex is equal to the player who holds the last card
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return playerWhoholdLastCard;
    }

    /**
     * Generate a legal move, given the provided placement string.
     * A move is valid if:
     * - the location char is in the range A .. Z or 0..9
     * - there is a card at the chosen location;
     * - the destination location is different to Zhang Yi's current location;
     * - the destination is in the same row or column of the grid as Zhang Yi's current location; and
     * - drawing a line from Zhang Yi's current location through the card at the chosen location,
     * there are no other cards along the line from the same kingdom as the chosen card
     * that are further away from Zhang Yi.
     * If there is no legal move available, return the null character '\0'.
     *
     * @param placement the current placement string
     * @return a location character representing Zhang Yi's destination for the move
     */
    public static char generateMove(String placement) {
        // FIXME Task 10: generate a legal move
        ArrayList<Character> moves = new ArrayList<>();
        for (char elem : possible_move) {
            if (isMoveLegal(placement, elem) == true) {
                moves.add(elem);
            }
        }
        if (moves.size() == 0) {
            return '\0';
        } else if (moves.size() == 1) {
            return moves.get(0);
        } else {
            Random rand = new Random();
            int x = rand.nextInt(moves.size());
            return moves.get(x);
        }


    }

}
