package LeetCode75._28_649_Dota2SenateAttempted;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();

        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }

        System.out.println(qr.size());
        System.out.println(qd.size());

        for(;!qr.isEmpty() && !qd.isEmpty();){
            int r_i = qr.poll();
            int d_i = qd.poll();
            if(r_i < d_i) qr.add(r_i + n);
            else qd.add(d_i + n);
        }

        System.out.println(qr.size());
        System.out.println(qd.size());


        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }

}