package LeetCode75._3_1431KidsWiththeGreatestNumberofCandies;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    public static void setup(){
        solution=new Solution();
    }

    @Test
    public void testKidsWithCandies_whenValidRequest_ThenPass(){
        int[] list = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> resultList = Arrays.asList(true,true,true,false,true);

        assertEquals(resultList,solution.kidsWithCandies(list,extraCandies));

    }




}