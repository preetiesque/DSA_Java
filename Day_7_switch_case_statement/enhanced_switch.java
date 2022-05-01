package com.company;

import java.util.Scanner;

public class enhanced_switch {
    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the name of fruit");
        String fruit = ch.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Not available");
        }
    }
}
