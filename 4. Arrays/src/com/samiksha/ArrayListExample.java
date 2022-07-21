package com.samiksha;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(23);
//        list.add(466);
//        list.add(88438);
//        list.add(34);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.contains(34)); //true
//        System.out.println(list.contains(3433)); //false
//        list.set(0, 11);
//        System.out.println(list);

        //Input values from the user
        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
    }
}
