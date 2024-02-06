package com.jarikkomarik.stack;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleInHistogram {

    /**
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        return -1;
    }



    /**
     * Working O(n * n) solution
     * @param heights
     * @return
     */
    public int largestRectangleAreaSlow(int[] heights) {
        int max = heights[0];

        for (int i = 0; i < heights.length; i++) {
            int tempMax = heights[i];
            int nextLeft = i - 1;
            while (nextLeft >= 0 && heights[nextLeft] >= heights[i]){
                tempMax += heights[i];
                nextLeft--;
            }
            int nextRight = i + 1;
            while (nextRight < heights.length && heights[nextRight] >= heights[i]){
                tempMax += heights[i];
                nextRight++;
            }
            max = Math.max(max, tempMax);
        }


        return max;
    }

}
