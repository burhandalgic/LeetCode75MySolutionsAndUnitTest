package LeetCode75._1_1768MergeStringsAlternately;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

   private static Solution solution ;

   @BeforeEach
     public void setup(){
        solution = new Solution();
    }
    @Test
    public void mergeAlternately_whenValidRequest_ThenPass(){
        String text1 = "abcd";
        String text2 = "pq";
        String expectedResult = "apbqcd";

        String methodResult =solution.mergeAlternately(text1,text2);

        assertEquals(expectedResult,methodResult);
    }


}