package LeetCode75._3_1431KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNumber=0;
        for (int value : candies){
            if (value>maxNumber){
                maxNumber=value;
            }
        }
        int newMax;
        List<Boolean> newList = new ArrayList<>();
        for (int value:candies){
            newMax=extraCandies+value;
            if (newMax>=maxNumber){
                newList.add(true);
            }else{
                newList.add(false);
            }

        }
        return newList;
    }




    }

