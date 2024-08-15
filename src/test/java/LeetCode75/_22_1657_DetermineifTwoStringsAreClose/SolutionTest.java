package LeetCode75._22_1657_DetermineifTwoStringsAreClose;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    private static Solution solution = new Solution();


    @Test
    public void testCloseStrings_WhenValidRequest_ThenPass(){
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertTrue(solution.closeStrings(word1,word2));
    }

}