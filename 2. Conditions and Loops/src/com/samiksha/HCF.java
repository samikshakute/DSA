package com.samiksha;
/* HCF - Highest Common Factor.
    example1: The factors of 6 are: 1, 2, 3, 6. Here the HCF is 6
    example2: The factors of 9 and 24 are (1, 3, 9) and (1, 2, 3, 4, 6, 8, 12, 24). Here the HCF of 9 and 24 is 3 */

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = 0;
        for (int i=1; i<=a/2 || i<=b/2; i++) {
            if(a%i == 0 && b%i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of "+a+" and "+b+" is "+hcf);
    }
}