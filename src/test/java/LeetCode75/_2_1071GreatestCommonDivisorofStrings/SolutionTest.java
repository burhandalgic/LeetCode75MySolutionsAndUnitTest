package LeetCode75._2_1071GreatestCommonDivisorofStrings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution;

    @BeforeAll
    public static void setup(){
        solution = new Solution();
    }

    @Test
    public void testGcdOfStrings_whenValidRequest_ThenPass(){
        String text1 = "ABABAB";
        String text2 = "ABAB";
        String expectedResult = "AB";

        String methodResult =solution.gcdOfStrings(text1,text2);

        assertEquals(expectedResult,methodResult);
    }

    @Test
    public void testIsContains_whenValidRequest_ThenTrue(){
        String text1 = "ABABAB";
        String text2 = "AB";

        assertTrue(solution.isContains(text1,text2));
    }






}