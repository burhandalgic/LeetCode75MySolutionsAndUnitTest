package LeetCode75._345.ReverseVowelsofaString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String reverseVowels(String s) {
        List<Character> vovelList = new ArrayList<>();
        char[] charList = s.toCharArray();
        for (char ch : charList) {
            if (isVowel(ch)) {
                vovelList.add(ch);
            }
        }

        int index = vovelList.size() - 1;

        for (int i = 0; i < charList.length; i++) {
            if (isVowel(charList[i])) {
                charList[i] = vovelList.get(index);
                index--;
            }
        }
        String result = new String(charList);

        return result;


    }


    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else
            return false;
    }


}

