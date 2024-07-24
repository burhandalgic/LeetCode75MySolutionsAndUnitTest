package LeetCode75._2_1071GreatestCommonDivisorofStrings;

public class Solution {

    public String gcdOfStrings(String str1, String str2) {
        String bigString;
        String smallString;
        String result = "";

        if (str1.length()>str2.length()){
            bigString=str1;
            smallString=str2;
        }else {
            bigString=str1;
            smallString=str2;
        }

        for (int i=1;i<=smallString.length();i++){
            String checkString = smallString.substring(0,i);
            if (isContains(str1,checkString) && isContains(str2,checkString)){
                result = checkString;
            }

        }


        return result;
    }

    public boolean isContains(String bigString, String smallString){
        int biglen = bigString.length();
        int smalllen = smallString.length();

        if (biglen%smalllen!=0)
            return false;

        for (int i=0; i<biglen;){
            if (!bigString.substring(i,i+smalllen).equals(smallString))
                return false;
            i=i+smalllen;
        }

        return true;
    }


    }

