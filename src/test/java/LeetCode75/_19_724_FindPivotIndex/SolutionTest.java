package LeetCode75._19_724_FindPivotIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private static Solution solution = new Solution();


    @Test
    public void testPivotIndex_WhenValidRequest_ThenPass(){
        int[] list = {1,7,3,6,5,6};
        assertEquals(3,solution.pivotIndex(list));
    }



}