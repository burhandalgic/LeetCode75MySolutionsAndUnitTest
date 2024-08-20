package LeetCode75._24_2390_RemovingStarsFromaString;


import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    public String removeStars(String s) {


        Deque<Character> stack = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (char c : arr){
            if (c=='*' && !stack.isEmpty() ){
                stack.poll();
            }
            if (c!='*'){
                stack.push(c);
            }
        }
        int n = stack.size();
        char[] newArr = new char[n];
        for (int i = n-1 ; i>=0 ; i--){
            newArr[i]=stack.poll();
        }

        return new String(newArr);



    }

}