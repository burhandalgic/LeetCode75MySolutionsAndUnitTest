package LeetCode75._12_11_ContainerWithMostWater;
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
    public void testMaxArea_WhenValidRequest_ThenPass(){
        int[] list  = {1,8,6,2,5,4,8,3,7};
        int answer = 49;
        assertEquals(answer,solution.maxArea(list));
    }


}