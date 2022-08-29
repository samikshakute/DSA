package com.samiksha;


import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>(candies.length);
        int sum = 0;
        int max = candies[0];
//        for (int j : candies) {
//            if (j > max) {
//                max = j;
//            }
//        }
        for (int j : candies) {
            max = Math.max(max, j);
        }
        for (int candy : candies) {
            sum = candy + extraCandies;
            if (sum >= max) {
                l.add(true);
            } else {
                l.add(false);
            }
        }
//        for(int i=0; i<candies.length; i++) {
//            sum = candies[i] + extraCandies;
//            if(sum>=max) {
//                l.add(true);
//            }
//            else {
//                l.add(false);
//            }
//        }
        return l;
    }

    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}