package com.company;

import java.util.Scanner;

public class palindrome_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = in.nextInt();
        String result = palindrome(a);
        System.out.println("The number is " + result);
    }

    static String palindrome(int a) {
        int ans = 0;
        int temp = a;
        while (a > 0) {
            int rem = a % 10;
            ans = ans * 10 + rem;
            a = a / 10;
        }
        if (ans == temp) {
            return "Palindrome";
        } else {
            return "not a Palindrome";
        }
    }
}
