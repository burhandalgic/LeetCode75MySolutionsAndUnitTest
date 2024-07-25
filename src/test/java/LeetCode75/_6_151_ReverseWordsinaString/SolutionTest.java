package LeetCode75._6_151_ReverseWordsinaString;
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
    public void testReverseWords_whenValidRequest_ThenPass(){
        assertEquals("blue is sky the",solution.reverseWords("the sky is blue"));
    }




}