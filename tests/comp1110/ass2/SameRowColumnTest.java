package comp1110.ass2;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static comp1110.ass2.WarringStatesGame.*;

public class SameRowColumnTest {
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

    @Test
    public void testRowGood(){
        Random r = new Random();
        int rowIndex = r.nextInt(row.length);
        int loc = r.nextInt(row[rowIndex].length);
        char location = row[rowIndex][loc];
        assertTrue("The row index of " + location + " is " + rowIndex + ", but the function gives a false.", sameRow(location, rowIndex));
    }

    @Test
    public void testRowBad(){
        Random r = new Random();
        int trueRowIndex = r.nextInt(row.length);
        int falseRowIndex = r.nextInt(row.length);
        while (trueRowIndex == falseRowIndex)
            falseRowIndex = r.nextInt(row.length);
        int loc = r.nextInt(row[trueRowIndex].length);
        char location = row[trueRowIndex][loc];
        assertFalse("The row index of " + location + " is not " + falseRowIndex + ", but the function gives a true.", sameRow(row[trueRowIndex][loc], falseRowIndex));
    }

    @Test
    public void testColumnGood(){
        Random r = new Random();
        int colIndex = r.nextInt(column.length);
        int loc = r.nextInt(column[colIndex].length);
        char location = column[colIndex][loc];
        assertTrue("The column index of " + location + " is " + colIndex + ", but the function gives a false.", sameColumn(location, colIndex));
    }

    @Test
    public void testColumnBad(){
        Random r = new Random();
        int trueColIndex = r.nextInt(column.length);
        int falseColIndex = r.nextInt(column.length);
        while (trueColIndex == falseColIndex)
            falseColIndex = r.nextInt(column.length);
        int loc = r.nextInt(column[trueColIndex].length);
        char location = column[trueColIndex][loc];
        assertFalse("The column index of " + location + " is not " + falseColIndex + ", but the function gives a true.", sameColumn(location, falseColIndex));
    }
}
