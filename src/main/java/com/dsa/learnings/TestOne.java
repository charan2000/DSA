package com.dsa.learnings;

import javax.sound.midi.Track;
import java.util.HashMap;
import java.util.HashSet;

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

        return false;
    }

    public static void main(String[] args) {
        System.out.println(commonInTwoArraysExists());
    }

}
