package com.samiksha;

import java.util.Arrays;

public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 24, 63},
                {66, 98, 23, 11},
                {12, 77}
        };
        int target = 77;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int maxVal = max(arr);
        System.out.println("Maximum value in array is "+maxVal);
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target) {
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                // this loop will run till j < length of a particular row in that array
                if(arr[i][j] == target) {
                    //return target;
                    return new int[] {i,j}; // returning an array
                }
            }
        }
        return new int[] {-1, -1};
    }
    static int max(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] > maxVal) {
//                    maxVal = arr[i][j];
//                }
//            }
//        }
        // Using enhanced for loop
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > maxVal) {
                    maxVal = element;
                }
            }
        }
        return maxVal;
    }
}
