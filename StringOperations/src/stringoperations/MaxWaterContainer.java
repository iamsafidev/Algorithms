/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

/**
 *
 * @author HP
 */
public class MaxWaterContainer {
//https://leetcode.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            int length = Math.min(height[i], height[j]);
            int width = j - i;
            area = Math.max(area, length * width);
            if (i == j - 1) {
                i++;
                j = height.length - 1;
            } else {
                j--;
            }
        }
        return area;
    }
}
