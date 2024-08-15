package LeetCode75._21_1207_UniqueNumberofOccurrences;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private static Solution solution = new Solution();


    @Test
    public void testFindDifference_WhenValidRequest_ThenPass(){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        assertTrue(solution.uniqueOccurrences(arr));
    }






}