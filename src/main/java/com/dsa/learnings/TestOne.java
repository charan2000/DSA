package com.dsa.learnings;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class TestOne {

    private static boolean commonInTwoArraysExists() {
        int[] arr1 = new int[] { 2,5,7,3,89,0 };
        int[] arr2 = new int[] { 56,34,32,2,3 };

        HashSet<Integer> verifyMap = new HashSet<>();
        for(int i=0; i<arr1.length; i++ ) {
            if(!verifyMap.contains(arr1[i])) {
                verifyMap.add(arr1[i]);
            }
        }

        for(int j=0; j < arr2.length; j++) {
            if (verifyMap.contains(arr2[j])) return true;
        }
//        for(int i=0; i<arr1.length; i++) {
//            for( int j=0; j < arr2.length; j++) {
//                if ( arr1[i] == arr2[j]) {
//                    return true;
//                }
//            }
//        }
        return false;
    }

    private static String stringReversal(String str) {
        String newString = "";

        for(int i=str.length()-1;i>=0;i--) {
            // System.out.println(str.charAt(i));
            newString += str.charAt(i);
        }
        return newString;
    }


    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println(commonInTwoArraysExists());
        System.out.println(  stringReversal(":narahc mI sdnerp a&Y iH"));
        long endTime = System.nanoTime();
        testMapsInJava();
        double timeElapsed = (endTime - startTime) / 1000000.00  ;


        System.out.println("Time Elapsed: " + timeElapsed);

    }

    private static void testMapsInJava() {
        Map<String,String> gfg = new HashMap<String,String>();
      
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "www.geeksforgeeks.org");

        gfg.forEach((k,v) -> {
            System.out.println("Key: " + k);
            System.out.println("Value: " + v);
        });

    }

}
