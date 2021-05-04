/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

import static stringoperations.BackStringCompare.backSpaceCompare;
import static stringoperations.GreatestSumArray.greatestSum;
import static stringoperations.LongestSubstringFunction.lengthOfLongestSubstrings;
import static stringoperations.MaxWaterContainer.maxArea;
import static stringoperations.PalindromeString.isPalindromeString;

/**
 *
 * @author HP
 */
public class MainClass {

    public static void main(String[] args) {
        //      maxAreaFunction();
//        backSpaceCompareFunction();
        //longestSubStringFunction();
//        greatestSum(new int[] {1,3,7,9,2});
      //  String sentence = "A man, a plan:";
        String sentence = "madam:%%";
        isPalindromeString(sentence);
    }

    private static void backSpaceCompareFunction() {
        String s1 = "ab###z";
        String s2 = "ab#z";
        System.out.println(backSpaceCompare(s1, s2));
    }

    private static void longestSubStringFunction() {
//        String s = "abcabcbb";
//        String s = "bbbbb";
        String s = "ppwakew";
        //String s = "";
        System.out.println(lengthOfLongestSubstrings(s));
    }

    private static void maxAreaFunction() {
        int[] heights = {4, 3, 2, 1, 4};
        // int[] heights = {1,2,1};
        //int[] heights ={1,1};
        System.out.println("The max Area for Tanks is " + maxArea(heights));

    }

}
