package com.company;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the name of fruit");
        String fruit = ch.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Not available");
        }
    }
}
