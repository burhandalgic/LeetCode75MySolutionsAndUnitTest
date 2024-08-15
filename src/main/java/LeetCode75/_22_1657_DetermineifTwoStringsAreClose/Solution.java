package LeetCode75._22_1657_DetermineifTwoStringsAreClose;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;

public class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length()!=word2.length())
            return false;

        char[] charlist1 = word1.toCharArray();
        char[] charlist2 = word2.toCharArray();

        TreeMap<Character,Integer> maplist1 = new TreeMap<>();
        for (char i : charlist1){
            if (maplist1.containsKey(i)){
                int x = maplist1.get(i);
                x++;
                maplist1.put(i,x);
            }else {
                maplist1.put(i,1);
            }
        }

        TreeMap<Character,Integer> maplist2 = new TreeMap<>();
        for (char i : charlist2){
            if (maplist2.containsKey(i)){
                int x = maplist2.get(i);
                x++;
                maplist2.put(i,x);
            }else {
                maplist2.put(i,1);
            }
        }

        ArrayList<Character> list1Key = new ArrayList<>();
        ArrayList<Integer> list1Value = new ArrayList<>();
        ArrayList<Character> list2Key = new ArrayList<>();
        ArrayList<Integer> list2Value = new ArrayList<>();

        for (char i : maplist1.keySet()){
            list1Key.add(i);
            list1Value.add(maplist1.get(i));
        }

        for (char i : maplist2.keySet()){
            list2Key.add(i);
            list2Value.add(maplist2.get(i));
        }

        Collections.sort(list1Value);
        Collections.sort(list2Value);
        if (!list1Key.equals(list2Key))
            return false;
        if (!list1Value.equals(list2Value))
            return false;


return true;
    }

}