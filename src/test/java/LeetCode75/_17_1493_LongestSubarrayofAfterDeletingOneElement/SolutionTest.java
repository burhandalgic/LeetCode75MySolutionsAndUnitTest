package LeetCode75._17_1493_LongestSubarrayofAfterDeletingOneElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Solution solution = new Solution();
   /* @BeforeAll
    public static void setup(){
        solution= new Solution();
    }
    */

    @Test
    public void testLongestSubarray_WhenValidRequest_ThenPass(){
        int[] list = {0,1,1,1,0,1,1,0,1};
        assertEquals(5,solution.longestSubarray(list));
    }

}