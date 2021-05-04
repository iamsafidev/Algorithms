package stringoperations;

import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

public class PalindromeString {

    static void isPalindromeString(String s) {
        Stack<Character> alphabetStack = new Stack();
        String regex = "[^A-Za-z0-9]";
        s = Pattern.compile(regex).matcher(s).replaceAll("");
        for (int i = 0; i < s.length(); i++) {
            alphabetStack.push(s.charAt(i));
        }
        String reversedString = "";
        Iterator iterator = alphabetStack.iterator();
        while (iterator.hasNext()) {
            reversedString += alphabetStack.pop();
        }
        if (reversedString.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
