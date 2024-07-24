package LeetCode75._1_1768MergeStringsAlternately;

public class Solution {
        public String mergeAlternately(String word1, String word2) {
            int len1=word1.length();
            int len2=word2.length();
            String result= "";
            int i=0;
            int j=0;
            while (len1>0 || len2>0){
                if(len1>0){
                    result = result.concat(String.valueOf(word1.charAt(i)));
                    len1--;
                    i++;
                }

                if(len2>0){
                    result = result.concat(String.valueOf(word2.charAt(j)));
                    len2--;
                    j++;
                }

            }

            return result;

        }

    }

