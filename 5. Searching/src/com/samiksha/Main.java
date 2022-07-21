package com.samiksha;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 34, -1, 33, 88, 99};
        int target = 34;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    // search the target and return the index
    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
        // search the target and return the element using for each loop
        for(int element: arr) {
            if(element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence target not found
        return -1;
//        return Integer.MAX_VALUE; // we can use this constant value instead of returning -1 if our array consists of an element -1
    }
}
