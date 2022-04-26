package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Palindrome Checker
        int ans = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = in.nextInt();
        int f = num;

        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }

        if ( ans == f) {
            System.out.println("Your number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

    }
}
