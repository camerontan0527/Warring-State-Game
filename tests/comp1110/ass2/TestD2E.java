package comp1110.ass2;


import org.junit.Test;

import static comp1110.ass2.WarringStatesGame.*;
import static comp1110.ass2.TestUtility.BASE_ITERATIONS;
import static comp1110.ass2.TestUtility.PLACEMENTS;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestD2E {
    @Test
    public void testZhangLocation() {
        for (int i = 0; i < PLACEMENTS.length; i++) {
            assertFalse("This is not zhang yi", zhangLocation(PLACEMENTS[i]).charAt(0) != 'z');
            assertFalse("wrong length", zhangLocation(PLACEMENTS[i]).length() != 3);
        }
    }
    @Test
    public void testPlacementArray(){
        for (int i = 0; i < PLACEMENTS.length; i++){
            assertFalse("The length isn't correct",placementArray(PLACEMENTS[i]).length != 36);
        }
    }

}
