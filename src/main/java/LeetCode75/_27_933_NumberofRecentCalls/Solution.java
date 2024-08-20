package LeetCode75._27_933_NumberofRecentCalls;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<Integer> queue ;
    public Solution() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        while(true){
            if( queue.peek() != null && queue.peek() < t-3000 ){
                queue.remove();
            }else{break;}
        }
        queue.add(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 * 1,100,3001,3002
 */