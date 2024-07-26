package LeetCode75._8_334IncreasingTripletSubsequence;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Solution solution;

    @BeforeAll
    public static void setup(){
        solution=new Solution();
    }

    @Test
    public void testIncreasingTriplet_whenValidRequest_ThenTrue(){
        int [] list1 = {2,1,5,0,4,6};
        assertTrue(solution.increasingTriplet(list1));
    }
    @Test
    public void testIncreasingTriplet_whenUnValidRequest_ThenFalse(){
        int [] list1 = {2,1,5,0,4,2};
        assertFalse(solution.increasingTriplet(list1));
    }



}