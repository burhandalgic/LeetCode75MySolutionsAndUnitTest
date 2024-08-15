package LeetCode75._23_2352_EqualRowandColumnPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution = new Solution();
    @Test
    public void testEqualPairs_WhenValidRequest_ThenPass(){
        int[][] arr = {{3,2,1},{1,7,6},{2,7,7} };
        assertEquals(1,solution.equalPairs(arr));
    }



}