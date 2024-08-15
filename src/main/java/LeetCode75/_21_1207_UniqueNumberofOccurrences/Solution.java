package LeetCode75._21_1207_UniqueNumberofOccurrences;

import java.util.*;

public class Solution {

    public boolean uniqueOccurrences(int[] arr) {

        TreeMap<Integer,Integer> list1 = new TreeMap<>();
        for (int i : arr){
            if (list1.containsKey(i)){
                int x = list1.get(i);
                x++;
                list1.put(i,x);
            }else {
                list1.put(i,1);
            }
        }
        HashSet<Integer> list2 = new HashSet<>();
        for (int i : list1.keySet()){
            list2.add(list1.get(i));
        }

        if (list1.size() == list2.size())
            return true;
        return false;
    }


}