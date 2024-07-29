package LeetCode75._11_392_IsSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sActual=0;
        int sLen = s.length();
        int tLen = t.length();
        if (s.length()==0)
            return true;
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();
        for (int i=0 ; i<tLen;i++){
            if (tChar[i]==sChar[sActual]){
                sActual++;
                if (sActual==sLen)
                    return true;
            }
        }
        return false;
    }

    }

