package LeetCode75._10_283MoveZeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        for (int i=0; i<len ;i++) {
            if (nums[i]==0) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }




    }

