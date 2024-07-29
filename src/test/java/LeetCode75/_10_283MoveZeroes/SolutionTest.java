package LeetCode75._10_283MoveZeroes;

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
    public void testMoveZeroes_WhenValidRequest_ThenPass(){
        int[] list = {0,1,0,3,12};
        int[] list2 = {1,3,12,0,0};
        solution.moveZeroes(list);
        assertArrayEquals(list,list2);
    }







}