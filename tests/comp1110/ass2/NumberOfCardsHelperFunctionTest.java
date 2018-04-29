package comp1110.ass2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

/**
 * Test objective:
 * <p>
 * Determine if the number of cards collected for each kingdom is correct in the numberOfCardsForEachKingdom helper function
        */
public class NumberOfCardsHelperFunctionTest {
    @Test
    public void countNumberOfCards(){
        //need to use assertEquals to see if output is correct
        final HashMap<Integer, ArrayList<Integer>> p1 = new HashMap<>();
        final ArrayList<Integer> p1A= new ArrayList<>();
        p1A.add(0,0);
        p1A.add(1,0);
        p1A.add(2,0);
        p1A.add(3,0);
        p1A.add(4,0);
        p1A.add(5,0);
        p1A.add(6,0);
        p1.put(1,p1A);

        final HashMap<Integer, ArrayList<Integer>> p2 = new HashMap<>();
        final ArrayList<Integer> p2A= new ArrayList<>();
        p2A.add(0,2);
        p2A.add(1,1);
        p2A.add(2,0);
        p2A.add(3,0);
        p2A.add(4,1);
        p2A.add(5,0);
        p2A.add(6,1);

        p2.put(2,p2A);
        final HashMap<Integer, ArrayList<Integer>> p3 = new HashMap<>();
        final ArrayList<Integer> p3A= new ArrayList<>();
        p3A.add(0,1);
        p3A.add(1,1);
        p3A.add(2,1);
        p3A.add(3,1);
        p3A.add(4,2);
        p3A.add(5,0);
        p3A.add(6,1);

        p3.put(3,p3A);

        final HashMap<Integer, ArrayList<Integer>> p4 = new HashMap<>();
        final ArrayList<Integer> p4A= new ArrayList<>();
        p4A.add(0,2);
        p4A.add(1,3);
        p4A.add(2,1);
        p4A.add(3,1);
        p4A.add(4,2);
        p4A.add(5,2);
        p4A.add(6,1);

        p4.put(4,p4A);

        assertEquals(p1, WarringStatesGame.numberOfCardsForEachKingdom("", 1));
        assertEquals(p2, WarringStatesGame.numberOfCardsForEachKingdom("a1b2g2e4a2", 2));
        assertEquals(p3, WarringStatesGame.numberOfCardsForEachKingdom("a1d3c3e1e2g2b4", 3));
        assertEquals(p4, WarringStatesGame.numberOfCardsForEachKingdom("a1d3c3e1e2g2b4a2f2f3b1b2", 4));


    }

}
