package LeetCode75._12_11_ContainerWithMostWater;

public class Solution {

    public int maxArea(int[] height) {

    int minIndex=0;
    int maxIndex=height.length-1;

    int actArea=0;
    int minValue=0;
    int maxArea=0;
    while (minIndex<maxIndex) {
        if (height[minIndex] > height[maxIndex]) {
            minValue = height[maxIndex];
        } else {
            minValue = height[minIndex];
        }

        actArea = minValue * (maxIndex - minIndex);
        if (actArea>maxArea)
            maxArea=actArea;

        if (height[minIndex] > height[maxIndex]) {
            maxIndex--;
        } else {
            minIndex++;
        }


    }


    return maxArea;

    }









    }

