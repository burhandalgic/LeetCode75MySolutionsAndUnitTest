package LeetCode75._16_1004_MaxConsecutiveOnesIII;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int zeros;
        int actOne=0;
        int maxOne= Integer.MIN_VALUE;
        for (int i = 0 ; i<len;i++) {
            zeros=k;
            for (int j=i;j<len;j++) {

                if (nums[j]==0) {
                    zeros--;

                    if (zeros<0 ) {
                        actOne=j-i;
                        break;
                    }

                }

                    if (j==len-1) {
                        actOne=j-i+1;
                        break;
                    }




            }
            if (actOne>maxOne)
                maxOne=actOne;
        }
        return maxOne;
    }
}
