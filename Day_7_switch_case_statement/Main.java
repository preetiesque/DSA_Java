package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter the name of the fruit");
        String fruit = ch.next();

        if (fruit.equals("mango")) {
            System.out.println("King of the fruits");
        }

        if (fruit.equals("apple")) {
            System.out.println("Sweet red fruit");
        }
    }
}
