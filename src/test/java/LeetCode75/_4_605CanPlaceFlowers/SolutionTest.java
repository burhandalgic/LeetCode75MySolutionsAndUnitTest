package LeetCode75._4_605CanPlaceFlowers;
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
    public void testCanPlaceFlowers_whenValidRequest_ThenPass(){
        int[] list = {1,0,0,0,1};
        int n = 1;
        assertTrue(solution.canPlaceFlowers(list,n));
    }
}