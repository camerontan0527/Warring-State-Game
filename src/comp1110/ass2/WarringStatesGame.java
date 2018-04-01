package comp1110.ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
    static ArrayList<Character> possible_move =
            new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
                    'P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3',
                    '4','5','6','7','8','9'  ));

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
        String[] ar = placement.split("(?<=\\G...)");
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
        String[] ar = placement.split("(?<=\\G...)");
        if (locationChar < '0' || (locationChar > '9' && locationChar < 'A') || locationChar > 'Z') {
            return false;
        }
        Character [] thirdChar = new Character[ar.length]; //check if there's a card at chosen location
        for (int i = 0; i < ar.length; i++) {
            thirdChar[i] = ar[i].charAt(2);
        }
        if ((Arrays.asList(thirdChar).contains(locationChar)) == false) {
            return false;
        }
        String zhangLocation = "";
        for (String elem : ar) {
            if (elem.charAt(0) == 'z' && elem.charAt(1) == '9') {
                zhangLocation = elem; // Zhang's current card (Z9_)
            }
        }
        String locationCard = "";
        for (String elem : ar) {
            if (elem.charAt(2) == locationChar) {
                locationCard = elem; // location's current card (_ _ locationChar)
            }
        }
        int rowIndex = 0;  // return the row where zhang is
        for (char[] elem : row) {
            if (new String(elem).contains(String.valueOf(zhangLocation.charAt(2)))) {
                rowIndex = Arrays.asList(row).indexOf(elem);
            }
        }
        int columnIndex = 0;  // return the column where zhang is
        for (char[] elem : column) {
            if (new String(elem).contains(String.valueOf(zhangLocation.charAt(2)))) {
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
        ArrayList<String> cardAtsameColumn = new ArrayList<>(); // return a List of cardString at the same column
        char[] columnPosition = column[columnIndex]; // return all the locationChar of zhang's column
        for (String elem : ar) {
            for (int i = 0; i < 6; i++) {
                if (elem.charAt(2) == columnPosition[i])
                    cardAtsameColumn.add(elem);
            }
        }
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
            } else if ((Arrays.asList(cardAtsameRow).get(0).indexOf(zhangLocation)) < ((Arrays.asList(cardAtsameRow)).get(0).indexOf(locationCard))) {
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
                }return true;
            }
        }else{
            if (columnIndex == columnLocationIndex) { // they're in the same row
                if (sameColumnKingdom.size() == 1) {
                    return true;
                } else if ((Arrays.asList(cardAtsameColumn).get(0).indexOf(zhangLocation)) < ((Arrays.asList(cardAtsameColumn)).get(0).indexOf(locationCard))) {
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
    static boolean isMoveSequenceValid(String setup, String moveSequence) {
        // FIXME Task 6: determine whether a placement sequence is valid
        // check if the length of the set up = 36
        //needs to call isMoveLegal function
        // this function checks the isMoveLegal function multiple times
        //  check if the next move is in the same column/row as the previous one
        //if one move passes, the current move for the next move will be the move which passed the is current location
        String placement = setup;
        String[] ar = setup.split("(?<=\\G...)");
        ArrayList<String> board = new ArrayList<>();
        char location = ' ';
        char kingdom = ' ';
        String zhang_location = "";
        int row_index = row.length;
        int col_index = column.length;
        String new_character = "";
        String new_location = "";
        if (ar.length != 36) // check if setup is made up by 36 elements
            return false;
        for (int i = 0; i < moveSequence.length(); i++){
            ArrayList<String> array = new ArrayList<>();
            for (int j = 0; j < placement.length(); j = j + 3){
                array.add(placement.substring(j, j + 3));
            }
            location = moveSequence.charAt(i);
            if (!(isMoveLegal(placement, location)))
                return false;
            System.out.println("pass");
            System.out.println("location" + location);
            System.out.println("placement: " + placement);
            for (String elem : array){
                if (elem.charAt(0) == 'z' && elem.charAt(1) == '9')
                    zhang_location = elem;
            }
            placement = placement.replace(zhang_location, "");
            for (String elem : array){ // put zhang yi at his next position
                if (elem.charAt(2) == location) {
                    kingdom = elem.charAt(0);
                    new_character = elem;
                }
            }
            new_location = "z9" + location;
            placement = placement.replace(new_character, new_location);
            for (int m = 0; m < row.length; m++){
                for (int n = 0; n < row[m].length; n++){
                    if (zhang_location.charAt(2) == row[m][n])
                        row_index = m;
                }
            }
            for (int m = 0; m < column.length; m++){
                for (int n = 0; n < column[m].length; n++){
                    if (zhang_location.charAt(2) == column[m][n])
                        col_index = m;
                }
            }
            String mid = "";
            ArrayList<String> remove_elem = new ArrayList<>();
            if (sameRow(location, row_index)){
                int ri1 = row_str[row_index].indexOf(zhang_location.charAt(2));
                int ri2 = row_str[row_index].indexOf(location);
                if (ri1 > ri2)
                    mid = row_str[row_index].substring(ri2 + 1, ri1);
                else
                    mid = row_str[row_index].substring(ri1 + 1, ri2);
                for (int m = 0; m < mid.length(); m++){
                    for (String elem : array){
                        if (elem.charAt(2) == mid.charAt(m) && elem.charAt(0) == kingdom)
                            remove_elem.add(elem);
                    }
                }
                for (String elem : remove_elem){
                    placement = placement.replace(elem, "");
                }
            }
            else if (sameColumn(location, col_index)){
                int ci1 = col_str[col_index].indexOf(zhang_location.charAt(2));
                int ci2 = col_str[col_index].indexOf(location);
                if (ci1 > ci2)
                    mid = col_str[col_index].substring(ci2 + 1, ci1);
                else
                    mid = col_str[col_index].substring(ci1 + 1, ci2);
                for (int m = 0; m < mid.length(); m++){
                    for (String elem : array){
                        if (elem.charAt(2) == mid.charAt(m) && elem.charAt(0) == kingdom)
                            remove_elem.add(elem);
                    }
                }
                System.out.println(remove_elem.size());
                for (String elem : remove_elem){
                    placement = placement.replace(elem, "");
                }
                System.out.println("placement: " + placement);
            }
        }
        return true;
    }

    static boolean sameRow(char loc, int i){
        for (int j = 0; j < row[i].length; j++){
            if (row[i][j] == loc)
                return true;
        }
        return false;
    }

    static boolean sameColumn(char loc, int i){
        for (int j = 0; j < column[i].length; j++){
            if (column[i][j] == loc)
                return true;
        }
        return false;
    }


//gets the index of the first move of the second player
    public static Integer playerTwoFirstMove (String moveSequence){
        String[] ar = moveSequence.split("(?<=\\G...)");
        int i =0;
        int x= 0;
        while (i<ar.length){
            if (ar[i].charAt(0)==ar[i+1].charAt(0)){
                i++;
            } else if (ar[i].charAt(0)!=ar[i+1].charAt(0)){
                x = i+1;
            }
        }return x;
    }
//gets the index of the first move of the third player
    public static Integer playerThreeFirstMove (String moveSequence){
        String[] ar = moveSequence.split("(?<=\\G...)");
        int i =0;
        int x= 0;
        while (i<ar.length){
            if (ar[i].charAt(0)==ar[i+1].charAt(0)){
                i++;
            } else if (ar[i].charAt(0)!=ar[i+1].charAt(0)){
                int j=i+1;
                while (j<ar.length){
                    if (ar[j].charAt(0)==ar[j+1].charAt(0)) {
                        j++;
                    }else if (ar[j].charAt(0)!=ar[j+1].charAt(0)){
                        x=j+1;
                    }
                }
            }
        }return x;
    }

    //gets the index of the first move of the third player
    public static Integer playerFourFirstMove (String moveSequence){
        String[] ar = moveSequence.split("(?<=\\G...)");
        int i =0;
        int x= 0;
        while (i<ar.length){
            if (ar[i].charAt(0)==ar[i+1].charAt(0)){
                i++;
            } else if (ar[i].charAt(0)!=ar[i+1].charAt(0)){
                int j=i+1;
                while (j<ar.length){
                    if (ar[j].charAt(0)==ar[j+1].charAt(0)) {
                        j++;
                    }else if (ar[j].charAt(0)!=ar[j+1].charAt(0)){
                        int k=j+1;
                        while (k<ar.length){
                            if (ar[k].charAt(0)==ar[k+1].charAt(0)){
                                k++;
                            }else if (ar[k].charAt(0)!=ar[k+1].charAt(0)){
                                x = k+1;
                            }
                        }
                    }
                }
            }
        }return x;
    }
    //add a for loop to determine the next move for player (need to check if player one/two/three/four collects one card or more than one)
    public static Integer playerNextMove (Integer x, String moveSequence){
        String[] ar = moveSequence.split("(?<=\\G...)");
        int r = 0;
        for (int j=x; j<ar.length; j++){
            if (ar[j].charAt(0)==ar[j+1].charAt(0)){
                j++;
            } else if (ar[j].charAt(0)!=ar[j+1].charAt(0)){
                r = j+1;
            }
        }return r;
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
        //create different arrays for each player which stores the kingdoms collected
        // return: get the cards that player is holding
        String[] ar = moveSequence.split("(?<=\\G...)");
        String supporters = "";


        if (isMoveSequenceValid(setup, moveSequence)==true){
            if (numPlayers==2){
                if (playerId==0){
                    int i =0;
                    while (i<ar.length){
                        if (ar[i].charAt(0)==ar[i+1].charAt(0) && ar[i+1].charAt(0)==ar[i+2].charAt(0)){
                            //add i and i+1 supporters to list and go to the the i+2th element
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1))+String.valueOf(ar[i+1].charAt(0))+String.valueOf(ar[i+1].charAt(1));
                            i+=2;
                        } else if (ar[i].charAt(0)==ar[i+1].charAt(0) && ar[i+1].charAt(0)!=ar[i+2].charAt(0)){
                            //add i and i+1 to supporters list and move to i+3
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1))+String.valueOf(ar[i+1].charAt(0))+String.valueOf(ar[i+1].charAt(1));
                            //add a for loop to determine the next move for player one (need to check if player two collects one card or more than one)
                            i=playerNextMove(i+2, moveSequence);

                        }else if (ar[i].charAt(0)!=ar[i+1].charAt(0)){
                            //add i to supporters and move i+2
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1));

                            i =playerNextMove(i+2, moveSequence);
                        }
                    }
                } else if (playerId==1) {
                    Integer x = playerTwoFirstMove(moveSequence);
                    int i = x;
                    while (i < ar.length) {
                        if (ar[i].charAt(0) == ar[i + 1].charAt(0) && ar[i + 1].charAt(0) == ar[i + 2].charAt(0)) {
                            //add i and i+2 supporters to list and go to the the i+2th element
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1))+String.valueOf(ar[i+1].charAt(0))+String.valueOf(ar[i+1].charAt(1));
                            i += 2;
                        } else if (ar[i].charAt(0) == ar[i + 1].charAt(0) && ar[i + 1].charAt(0) != ar[i + 2].charAt(0)) {
                            //add i and i+1 to supporters list and move to i+3
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1))+String.valueOf(ar[i+1].charAt(0))+String.valueOf(ar[i+1].charAt(1));
                            //add a for loop to determine the next move for player one (need to check if player two collects one card or more than one)
                            i =playerNextMove(i+2, moveSequence);
                        } else if (ar[i].charAt(0) != ar[i + 1].charAt(0)) {
                            //add i to supporters and move i+2
                            supporters = supporters + String.valueOf(ar[i].charAt(0))+ String.valueOf(ar[i].charAt(1));
                            i =playerNextMove(i+2, moveSequence);
                        }
                    }
                }
                }else if (numPlayers==3){
                if (playerId==0){


                }else if (playerId==1){
                    Integer x = playerTwoFirstMove(moveSequence);

                }else if (playerId==2){
                    Integer x = playerThreeFirstMove(moveSequence);

                }

            }else if (numPlayers==4){
                if (playerId==0){

                }else if (playerId==1){
                    Integer x = playerTwoFirstMove(moveSequence);

                }else if (playerId==2){
                    Integer x = playerThreeFirstMove(moveSequence);

                }else if (playerId==3){
                    Integer x = playerFourFirstMove(moveSequence);

                }

            }


        }
        return supporters;
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

        return null;
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
        for (char elem : possible_move){
            if (isMoveLegal(placement,elem) == true){
                moves.add(elem);
            }
        }
        if (moves.size() == 0) {
            return '\0';
        }else if (moves.size() == 1){
            return moves.get(0);
        }else {
            Random rand = new Random();
            int x = rand.nextInt(moves.size());
            return moves.get(x);
        }


    }
}