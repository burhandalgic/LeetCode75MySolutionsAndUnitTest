package LeetCode75._16_1004_MaxConsecutiveOnesIII;

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
    public void testLongestOnes_WhenValidRequest_ThenPass(){
        int[] list = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        assertEquals(10,solution.longestOnes(list,k));
    }



}