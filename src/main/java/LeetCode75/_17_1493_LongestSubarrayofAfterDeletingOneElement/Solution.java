package LeetCode75._17_1493_LongestSubarrayofAfterDeletingOneElement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public int longestSubarray(int[] nums) {
        int len = nums.length;
        boolean allOne = Arrays.stream(nums).allMatch(n->n==1);
        if (allOne)
            return len-1;
        int maxOne=0;
        int actOne=0;
        boolean deletePower=true;


        for (int i = 0 ; i<len;i++){

        if (   nums[i]==1 && (i==0 || nums[i-1]==0) ) {

            deletePower=true;
            actOne=1;

            for (int j=i+1 ; j<len; j++){
                if (nums[j]==1){
                    actOne++;
                } else if (nums[j]==0 && deletePower==true) {
                    deletePower=false;
                }else
                    break;
            }
            if (actOne>maxOne)
                maxOne=actOne;
        }



        }

        return maxOne;
    }




}
