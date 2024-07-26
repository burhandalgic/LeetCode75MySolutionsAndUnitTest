package LeetCode75._9_443StringCompression;

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
    public void testCompress_WhenValidRequest_ThenPass(){
        char[] list = {'a','a','b','b','c','c','c'};
        assertEquals(6,solution.compress(list));
    }
}