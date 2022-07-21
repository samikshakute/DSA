package com.samiksha;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee id: ");
        int empId = in.nextInt();
        System.out.println("Enter the department: ");
        String department = in.next();
        switch (empId) {
            case 1:
                System.out.println("Samiksha Kute");
                break;
            case 2:
                System.out.println("Rahul Jain");
                switch (department) {
                    case "Computer":
                        System.out.println("Computer Department");
                        break;
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Electrical":
                        System.out.println("Electrical Department");
                        break;
                    default:
                        System.out.println("Invalid department!!");
                }
            default:
                System.out.println("Enter correct Employee Id");
        }
    }
}