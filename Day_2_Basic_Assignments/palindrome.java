package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int ans = 0;
        int number = 11211;
        int rem;
         while (number > 0) {
             rem = number % 10;
             ans = ans * 10 + rem; //silly mistake here
             number = number / 10;
         }

        System.out.println(ans);

    }
}
