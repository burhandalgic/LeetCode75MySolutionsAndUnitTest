package LeetCode75._19_724_FindPivotIndex;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int [] sumNumsLeft = new int[len];
        sumNumsLeft[0]= 0;
        for (int i=1 ; i<len ; i++ ){
            sumNumsLeft[i]= sumNumsLeft[i-1] + nums[i-1];
        }

        int sumlist = Arrays.stream(nums).sum();
        int halfSum=0;

        for (int i = 0; i<len;i++) {

            if (  (sumlist-nums[i]) %2 !=  0 )
                continue;
            halfSum = (sumlist-nums[i]) / 2;

            if (sumNumsLeft[i]==halfSum)
                return i;
        }

return -1;
    }

}