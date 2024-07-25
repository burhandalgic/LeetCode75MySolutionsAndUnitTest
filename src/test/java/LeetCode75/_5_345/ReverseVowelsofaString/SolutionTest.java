package LeetCode75._5_345.ReverseVowelsofaString;

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
    public void testisVowel_whenValidRequest_ThenTrue(){
        assertTrue(solution.isVowel('a'));
    }

    @Test
    public void testReserseVowels_whenValidRequest_ThenPass(){
        assertEquals("holle" ,solution.reverseVowels("hello"));
    }

}