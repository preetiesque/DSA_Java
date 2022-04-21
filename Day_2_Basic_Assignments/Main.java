package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program to print whether the number is odd or even
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
