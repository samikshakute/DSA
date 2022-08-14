package com.samiksha;
// The least common multiple, lowest common multiple, or smallest common multiple of two integers a and b, usually denoted by lcm(a, b), is the smallest positive integer that is divisible by both a and b.
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int max = Math.max(a, b);
        int lcm = 0;
        while(true) {
            if(max%a == 0 && max % b == 0){
                System.out.println(max);
                break;
            }
           max++;
        }
    }
}