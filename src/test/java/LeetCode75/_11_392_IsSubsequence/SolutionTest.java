package LeetCode75._11_392_IsSubsequence;

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
    public void testIsSubsequence_WhenValidRequest_ThenTrue(){
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(solution.isSubsequence(s,t));
    }




}