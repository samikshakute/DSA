package com.samiksha;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        { // Block scope
            // int a = 22; // already initialised outside the block in the same method(main), hence we cannot initialise again
            a = 22; // we can reassign the origin ref variable to some other value
            int c = 20;
            System.out.println(a);
            // value initialised in this block, will remain in this block
        }
        // scoping in for loops
        for(int i=0; i<3; i++) {
            System.out.println(i); // here i variable cannot be used outside the for loop
            // int a = 11; // error
        }
        System.out.println(a);
        // System.out.println(c); // c here is out of scope cannot be used outside the block

    }
}
