package com.unique.jointrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    

    public static char[] sortByAscii(char[] testChars){
        char tmp;
        
        if(testChars[0] > testChars[1]){
            tmp = testChars[0];
            testChars[0] = testChars[1];
            testChars[1] = tmp;
        }
        
        if(testChars[0] > testChars[2]){
            tmp = testChars[0];
            testChars[0] = testChars[2];
            testChars[2] = tmp;
        }
        
        if(testChars[1] > testChars[2]){
            tmp = testChars[1];
            testChars[1] = testChars[2];
            testChars[2] = tmp;
        }
        return testChars;
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
            testChars = sortByAscii(testChars);
            System.out.println(testChars[0] + " "+testChars[1] + " " + testChars[1]);
        }
        return;
    }
}