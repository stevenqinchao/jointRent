package com.unique.jointrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CheckSignMatch {

    /**
     * method description goes here
     * @param args
     */
    static boolean  check(char[] testChars) {
        Stack<Character> stack = new Stack<Character>();
        for (char testChar : testChars) {
            if ('[' == testChar) {
                stack.push(testChar);
            } else if ('(' == testChar) {
                stack.push(testChar);
            } else if (')' == testChar) {
                if (stack.empty()) {
                    return false;
                }
                if('(' != stack.pop()){
                    return false;
                }
            } else if (']' == testChar) {
                if (stack.empty()) {
                    return false;
                }
                if('[' != stack.pop()){
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]) {

        Scanner cin1 = new Scanner(System.in);
        int testCount = cin1.nextInt();

        List<String> stringList = new ArrayList<String>();

        Scanner cin2 = new Scanner(System.in);

        for (int i = 0; i < testCount; i++) {
            stringList.add(cin2.nextLine());
        }

        for (String testString : stringList) {
            char[] testChars = testString.toCharArray();
            System.out.println(check(testChars)?"Yes":"No");
        }
        return;
    }

}
