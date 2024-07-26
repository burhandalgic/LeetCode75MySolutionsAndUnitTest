package LeetCode75._9_443StringCompression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int compress(char[] chars) {

        int len=chars.length;
        StringBuilder stringBuilder = new StringBuilder();
        int sum;
        for (int i=0;i<len;i++){
            sum=1;
            stringBuilder.append(chars[i]);
            while ( i<len-1 && chars[i]==chars[i+1] ){
                sum++;
                i++;
            }
            if (sum!=1){
                stringBuilder.append(sum);
            }
        }
        char[] xlist = stringBuilder.toString().toCharArray();
        for (int i=0;i<xlist.length;i++){
            chars[i]=xlist[i];
        }
        return stringBuilder.length();


    }

    }

