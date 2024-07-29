package LeetCode75._13_1679_MaxNumberofKSumPairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Solution {

    public int maxOperations(int[] nums, int k) {

        int ops=0;
        int i=0;
        int j= nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                ops++;
                i++; j--;
            } else if(nums[i]+nums[j]>k){
                j--;
            } else{
                i++;
            }
        }
        return ops;





    }

    }

