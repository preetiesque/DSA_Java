package com.company;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = in.nextInt();
        String result = odd_even(a);
        System.out.println("The number is " + result);

    }
    static String odd_even(int a) {
        if (a % 2 == 0 ) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
