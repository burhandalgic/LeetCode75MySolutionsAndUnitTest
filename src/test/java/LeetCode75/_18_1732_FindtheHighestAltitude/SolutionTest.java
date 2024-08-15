package LeetCode75._18_1732_FindtheHighestAltitude;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Solution solution = new Solution();


    @Test
    public void testLargestAltitude_WhenValidRequest_ThenPass(){
        int[] list = {-5,1,5,0,-7};
        assertEquals(1,solution.largestAltitude(list));
    }

}