package LeetCode75._20_2215_FindtheDifferenceofTwoArrays;

import java.util.*;

public class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {


        Set<Integer> list1 = new LinkedHashSet<>();
        Set<Integer> list2 = new LinkedHashSet<>();
        for (int i : nums1){
            if (Arrays.stream(nums2).noneMatch(x->x==i)){
                list1.add(i);
            }
        }
        for (int i : nums2){
            if (Arrays.stream(nums1).noneMatch(x->x==i)){
                list2.add(i);
            }
        }
        List<List<Integer>> returnlist = new ArrayList<>();
        List <Integer> list1return = new ArrayList<>();
        List <Integer> list2return = new ArrayList<>();
        list1.stream().forEach(i->list1return.add(i));
        list2.stream().forEach(i->list2return.add(i));
        returnlist.add(list1return);
        returnlist.add(list2return);
        return returnlist;

    }


}