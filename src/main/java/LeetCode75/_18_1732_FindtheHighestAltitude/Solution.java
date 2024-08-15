package LeetCode75._18_1732_FindtheHighestAltitude;

import java.util.Arrays;

public class Solution {

    public int largestAltitude(int[] gain) {

        int maxScore = 0;
        int actScore = 0;

        for (int x :gain){
            actScore=actScore+x;
            if (actScore>maxScore)
                maxScore=actScore;
        }
        return maxScore;
    }


}
