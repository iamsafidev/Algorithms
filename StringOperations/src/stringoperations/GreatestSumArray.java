/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class GreatestSumArray {

    static void greatestSum(int[] nums) {
        int left = 0;
        int right = left + 1;
        int leftIndex = 0, rightIndex = 0;
        int greatestSum = 0;
        while (left <= nums.length - 2) {
            int currentSum = 0;
            currentSum = nums[left] + nums[right];
            if (currentSum > greatestSum) {
                leftIndex = left;
                rightIndex = right;
                greatestSum = currentSum;
            }
            left = right + 1;
            right = left + 1;
        }

        System.out.println("Greatest Sum is " + greatestSum + " from these integers " + nums[leftIndex] + " and " + nums[rightIndex]);
    }
}
