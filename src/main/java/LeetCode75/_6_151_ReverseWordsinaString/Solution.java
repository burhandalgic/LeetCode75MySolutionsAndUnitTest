package LeetCode75._6_151_ReverseWordsinaString;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public String reverseWords(String s) {

        List<String> list = Arrays.asList(s.split("\\s+"));
        Collections.reverse(list);
        StringBuilder resultBuilder = new StringBuilder();
        list.stream().forEach(n -> resultBuilder.append(n).append(" "));
        return resultBuilder.toString().trim();

    }


}

