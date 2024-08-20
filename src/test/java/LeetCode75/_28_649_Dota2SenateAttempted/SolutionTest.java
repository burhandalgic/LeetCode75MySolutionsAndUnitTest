package LeetCode75._28_649_Dota2SenateAttempted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution = new Solution();

    @Test
    public void testAstroidCollision_WhenValidRequest_ThenPass(){
        String s = "DDDDRRDDDRDRDRRDDRDDDRDRRRRDRRRRRDRDDRDDRRDDRRRDDRRRDDDDRRRRRRRDDRRRDDRDDDRRRDRDDRDDDRRDRRDRRRDRDRDR";
        assertEquals("Dire",solution.predictPartyVictory(s));
    }


}