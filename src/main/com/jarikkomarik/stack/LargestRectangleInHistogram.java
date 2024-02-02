package com.jarikkomarik.stack;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = heights[0];

        while (left <= right) {
            int min = heights[left];
            int counter = 1;
            for (int i = left + 1; i <= right; i++) {
                min = Math.min(min, heights[i]);
                counter++;
            }
            System.out.println(String.format("Left %d, right %d, counter %d, min %d, calculated area %d", left, right, counter, min, counter * min));
            max = Math.max(max, counter * min);
            if (heights[left] <= heights[right]) left++;
            else right--;
        }

        return max;
    }

}
