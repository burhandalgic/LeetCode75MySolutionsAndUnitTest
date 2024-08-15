package LeetCode75._23_2352_EqualRowandColumnPairs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {


    public int equalPairs(int[][] grid) {

        int result = 0;
        int n = grid[0].length;
        HashMap<ArrayList,Integer> mapList = new HashMap<>();
        ArrayList<Integer> arrayList;

        for (int i=0;i<n;i++){
            arrayList = new ArrayList<>();
            for (int j=0;j<n;j++){
                arrayList.add(grid[i][j]);
            }
            if (mapList.containsKey(arrayList)){
                int x = mapList.get(arrayList);
                mapList.put(arrayList,++x);
            }else {
                mapList.put(arrayList,1);
            }
        }




        for (int i=0;i<n;i++){
            arrayList=new ArrayList<>();
            for (int j=0;j<n;j++){
                arrayList.add(grid[j][i]);
            }
            if (mapList.containsKey(arrayList)) {
                result = result + mapList.get(arrayList);
            }
        }

        return result;





    }



}