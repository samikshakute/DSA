package com.samiksha;

public class Max {
    // To find the maximum value in the array
    public static void main(String[] args) {
        int[] arr = {1, 3, 596, 88, 4445};
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i = 0; i<arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        int maxVal = max(arr, 1, 3);
        System.out.println("The maximum value is " + maxVal);
    }

    //    static int max(int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
    static int max(int[] arr, int start, int end) {

        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
