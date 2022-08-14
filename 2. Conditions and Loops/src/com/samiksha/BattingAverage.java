// Batting average = runs scored / number of dismissals
// where, number of dismissals = number of innings - number f innings he/she remained Not Out
package com.samiksha;

import java.util.Scanner;

public class BattingAverage {
    public static int printAverage(int runs, int matches, int notout) {
        int dismissals = matches - notout;
        if(dismissals == 0) {
            return -1;
        }
        int avg = runs / dismissals;
        return avg;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of runs scored by the player: ");
        int runs = in.nextInt();
        System.out.print("Enter the number of matches: ");
        int matches = in.nextInt();
        System.out.println("Enter the number of innings the player remained no out: ");
        int notout = in.nextInt();
        System.out.println("Batting average = "+printAverage(runs, matches, notout));
    }
}