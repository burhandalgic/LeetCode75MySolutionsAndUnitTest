package LeetCode75._7_238_ProductofArrayExceptSelf;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {


    public int[] productExceptSelf(int[] nums) {

        if (Arrays.stream(nums).allMatch(n-> n==1))
            return nums;


        int[] resultList = new int [nums.length];
        int len = nums.length;
        double half = nums.length/2;
        int firstMultyResult=1;
        int lastMultyResult=1;

        for (int i = 0 ; i<len ;  i++  ) {
            if (i<half){
                firstMultyResult=firstMultyResult*nums[i];
            }else {
                lastMultyResult=lastMultyResult*nums[i];
            }

        }

        for (int i = 0 ; i<len ;  i++  ) {

            if (i<half){
                resultList[i]=multyOtherHalf(nums,i)*lastMultyResult;
            }else {
                resultList[i]=multyOtherHalf(nums,i)*firstMultyResult;
            }

        }

        return resultList;
    }


    public int multyOtherHalf (int[] nums , int index ){
        int len = nums.length;
        int result=1;
        double half = nums.length/2;

        if (index<half){

            for (int i=0;i<half;i++){
                if (i!=index)
                    result= result * nums[i];
            }

        }else {
            for (int i=(int) half;i<len;i++){
                if (i!=index)
                    result= result * nums[i];
            }
        }



        return result;
    }







}

