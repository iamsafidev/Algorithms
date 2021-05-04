package stringoperations;

import java.util.Stack;

public class BackStringCompare {
// With Complexity of O(2n) => O(n)
    public static void main(String[] args) {
        String s1 = "ab#z";
        String s2 = "ab#z";
        System.out.println(backSpaceCompare(s1, s2));
    }

    public static boolean backSpaceCompare(String sOne, String sTwo) {
        sOne = buildString(sOne);
        sTwo = buildString(sTwo);
        if (sOne.equals(sTwo)) 
            return true;
         else 
            return false;
       
    }

    private static String buildString(String sOne) {
        Stack<String> stringStack = new Stack();
        char[] stringOne = sOne.toCharArray();
        for (int i = 0; i < stringOne.length; i++) {
            if (stringOne[i] != '#') 
                stringStack.push(String.valueOf(stringOne[i]));
             else {
                if (!stringStack.empty()) 
                    stringStack.pop();
            }
        }
        //Making string after back operation
        String s = "";
        for (int i = 0; i < stringStack.size(); i++) {
            s += stringStack.elementAt(i);
        }
        return s;
    }
}
