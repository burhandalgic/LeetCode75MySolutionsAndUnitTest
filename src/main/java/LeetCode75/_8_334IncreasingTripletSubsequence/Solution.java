package LeetCode75._8_334IncreasingTripletSubsequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean increasingTriplet(int[] nums) {

        Set<Integer> list = new HashSet<>();
        Arrays.stream(nums).forEach(n-> list.add(n));
        if (list.size()<3)
            return false;



        int len = nums.length;
        for(int i=0;i<len-2;i++){
            for (int j=i+1;j<len-1;j++){
                if (nums[i]<nums[j]){
                    for (int k=j+1;k<len;k++){
                        if (nums[j]<nums[k])
                            return true;
                    }

                }

            }
        }
        return false;




    }
    }

