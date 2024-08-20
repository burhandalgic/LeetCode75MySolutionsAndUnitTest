package LeetCode75._25_735_AsteroidCollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private static Solution solution = new Solution();

    @Test
    public void testAstroidCollision_WhenValidRequest_ThenPass(){
        int [] arr1 = {10,2,-5};
        int [] arr2 = {10};
        assertArrayEquals(arr2,solution.asteroidCollision(arr1));
    }

}