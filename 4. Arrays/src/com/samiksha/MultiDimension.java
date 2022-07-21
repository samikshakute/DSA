package com.samiksha;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr2D = new int[3][]; // size of row is mandatory but not column
//        System.out.println(arr2D.length); // no of rows
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//          for(int row = 0; row<arr.length; row++) {
//              for(int col = 0; col<arr[row].length; col++) {
//                  System.out.print(arr[row][col] +" ");
//              }
//              System.out.println();
//          }
//          for(int row=0; row<arr.length; row++) {
//              System.out.println(Arrays.toString(arr[row]));
//          }
        for (int[] a : arr) { // here each element in the array(arr) is itself an array so datatype will be an array
            System.out.println(Arrays.toString(a));
        }
    }
}
