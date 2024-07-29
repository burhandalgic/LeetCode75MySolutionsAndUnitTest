package LeetCode75._13_1679_MaxNumberofKSumPairs;
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
    public void testMaxOperations_WhenValidRequest_ThenPass(){
        int[] list  = {3,1,3,4,3};
        int answer = 1;
        assertEquals(answer,solution.maxOperations(list,6));
    }

}