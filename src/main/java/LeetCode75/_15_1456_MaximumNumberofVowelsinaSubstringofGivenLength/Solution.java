package LeetCode75._15_1456_MaximumNumberofVowelsinaSubstringofGivenLength;

public class Solution {


    public int maxVowels(String s, int k) {
        int count=numberVowel(s.substring(0,k));
        int maxCount=count;
        int len = s.length();

        for (int i = 1 ; i<len-k+1 ;i++){

            if (!isVowel(s.charAt(i-1)) && isVowel(s.charAt(i+k-1)))
            count++;
            if (isVowel(s.charAt(i-1)) && !isVowel(s.charAt(i+k-1)))
                count--;

            if (count > maxCount )
                maxCount=count;
            if (maxCount==k)
                return k;

        }


        return maxCount;
    }


    int numberVowel(String s){
        int count = 0;
        int len = s.length();
        for (int i=0;i<len;i++){
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
                count++;
        }
        return count;
    }

    boolean isVowel(char c){
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                return true;
            }else
                return false;
    }


}

