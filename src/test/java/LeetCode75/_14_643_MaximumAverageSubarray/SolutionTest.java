package LeetCode75._14_643_MaximumAverageSubarray;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private static Solution solution;
    @BeforeAll
    public static void setup(){
        solution= new Solution();
    }
    @Test
    public void testFindMaxAverage_WhenValidRequest_ThenPass(){
        int[] list  = {1,12,-5,-6,50,3};
        assertEquals(12.75,solution.findMaxAverage(list,4));
    }

}