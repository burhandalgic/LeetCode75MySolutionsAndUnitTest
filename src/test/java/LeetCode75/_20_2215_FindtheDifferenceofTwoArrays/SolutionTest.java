package LeetCode75._20_2215_FindtheDifferenceofTwoArrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Solution solution = new Solution();


    @Test
    public void testFindDifference_WhenValidRequest_ThenPass(){
        int[] list1 = {1,2,3};
        int[] list2 = {2,4,6};
        List<List<Integer>> returnlist = new ArrayList<>();
        List <Integer> list1return = new ArrayList<>();
        List <Integer> list2return = new ArrayList<>();
        list1return.add(1);
        list1return.add(3);
        list2return.add(4);
        list2return.add(6);
        returnlist.add(list1return);
        returnlist.add(list2return);


        assertEquals(returnlist,solution.findDifference(list1,list2));
    }



}