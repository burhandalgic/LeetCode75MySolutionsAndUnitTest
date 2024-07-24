package LeetCode75._4_605CanPlaceFlowers;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyPlace=0;
        int arraylen = flowerbed.length;
        int previIndex;
        int nextIndex;
        for (int i=0;i<arraylen;i++){
            previIndex = i-1;
            nextIndex  = i+1;
            boolean preEmty=false;
            boolean nextEmty=false;


            if (previIndex < 0){
                preEmty=true;
            }else {
                if (flowerbed[previIndex]==0)
                    preEmty=true;
                if (flowerbed[previIndex]==1)
                    preEmty=false;
            }

            if (nextIndex>= arraylen){
                nextEmty=true;
            }else {
                if (flowerbed[nextIndex]==0)
                    nextEmty=true;
                if (flowerbed[nextIndex]==1)
                    nextEmty=false;
            }




            if (nextEmty&&preEmty&&flowerbed[i]==0) {
                emptyPlace++;
                flowerbed[i]=1;
            }
        }

        return emptyPlace>=n;
    }






    }

