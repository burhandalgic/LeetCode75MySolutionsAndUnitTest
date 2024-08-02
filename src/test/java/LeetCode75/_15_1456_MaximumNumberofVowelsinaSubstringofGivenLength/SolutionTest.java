package LeetCode75._15_1456_MaximumNumberofVowelsinaSubstringofGivenLength;

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
    public void testMaxVowels_WhenValidRequest_ThenPass(){
        String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k=33;
        assertEquals(7,solution.maxVowels(s,k));
    }



}