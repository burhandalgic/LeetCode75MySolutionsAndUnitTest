package LeetCode75._3_1431KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int[] maxNumber={0};
        int[] newMax={0};

        List<Boolean> newList = new ArrayList<>();

        Arrays.stream(candies).forEach(n -> { maxNumber[0] = (n>maxNumber[0]) ? n : maxNumber[0]; } );

        Arrays.stream(candies).forEach(n -> {

            newMax[0]=extraCandies+n;
            if (newMax[0]>=maxNumber[0]){
                newList.add(true);
            }else{
                newList.add(false);
            }

        } );

        return newList;
    }




    }

