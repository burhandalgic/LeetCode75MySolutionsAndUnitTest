package LeetCode75._14_643_MaximumAverageSubarray;

import java.util.Arrays;

public class Solution {


    public double findMaxAverage(int[] nums, int k) {

        int sum = 0 ;
        int result=-1000000000;
        int len = nums.length;
        for (int i =0;i<len-k+1;i++){
            for (int j=i;j<i+k;j++){    sum=sum+nums[j];   }
            if (sum>result)
                result=sum;
            sum=0;
        }
        return (double)result/k;

    }



    }

