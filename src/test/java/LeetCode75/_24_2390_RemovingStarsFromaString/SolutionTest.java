package LeetCode75._24_2390_RemovingStarsFromaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    public void testRemoveStars_WhenValidRequest_ThenPass(){
        String s = "leet**cod*e";
        assertEquals("lecoe",solution.removeStars(s));
    }



}