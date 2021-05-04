package stringoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringFunction {
//    https://leetcode.com/problems/longest-substring-without-repeating-characters/
//with time Complexity O(n*n)
    public static int lengthofLongestSubString(String s) {
        int length = 0;
        if (s.length() <= 1) {
            return s.length();
        }
        s.toCharArray();
        ArrayList<Character> stringAlphabetsList = new ArrayList();
        for (int left = 0; left < s.length(); left++) {
            stringAlphabetsList.clear();
            int currentLength = 0;
            for (int right = left; right < s.length(); right++) {
                if (stringAlphabetsList.contains(s.charAt(right))) {
                    break;
                } else {
                    currentLength++;
                    stringAlphabetsList.add(s.charAt(right));
                    length = Math.max(length, currentLength);
                }
            }
        }
        return length;
    }
//with time complexity O(n)
    public static int lengthOfLongestSubstrings(String s) {
        int i = 0;
        int j = i;
        int stringLength = 0;
        int currentLength = 0;
        if (s.length() == 1) {
            System.out.println(s.length());
        }
        char[] stringAlphabet = s.toCharArray();
        HashMap<Character, Integer> seenChars = new HashMap();
        List<Character> alphabetsList = new ArrayList();
        while (j < s.length()) {
            if (seenChars.containsKey(stringAlphabet[j])) {
                i = j;
                j = i;
                seenChars.clear();
                currentLength = 0;
            } else {
                seenChars.put(stringAlphabet[j], j);
                currentLength++;
                stringLength=Math.max(currentLength, stringLength);
                j++;
            }

        }
        return stringLength;
    }
}
