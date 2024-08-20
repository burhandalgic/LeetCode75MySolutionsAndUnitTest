package LeetCode75._25_735_AsteroidCollision;


import java.util.Deque;
import java.util.LinkedList;

public class Solution {



    public int[] asteroidCollision(int[] asteroids) {



        int n=asteroids.length;
        int entryNumber;
        Deque<Integer> stack = new LinkedList<>();
        for (int i=0; i<n;i++){

            if (stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }

            if (stack.peek()>0 && asteroids[i]>0 || stack.peek()<0 && asteroids[i]<0 || asteroids[i]>stack.peek()){

                stack.push(asteroids[i]);
                continue;
            }
            if ( Math.abs(stack.peek()) ==  Math.abs(asteroids[i]) ){
                stack.poll();
                continue;
            }

            if ( Math.abs(stack.peek()) >  Math.abs(asteroids[i]) ){
                continue;
            }

            stack.poll();
            i--;
        }

        int n2=stack.size();
        int[] result = new int[n2];
        for (int i=n2-1;i>=0;i--){
            result[i]=stack.poll();
        }
        return result;





    }



}