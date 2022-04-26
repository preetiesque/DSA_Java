package com.company;

import java.util.Scanner;

public class armstrong_class {
    public static void main(String[] args) {
        int ans = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your number");
        int rem,temp;
        int in = num.nextInt();
        temp = in;

        while (in > 0) {
            rem = in % 10;
            ans = ans + (rem * rem * rem);
            in = in / 10;
        }

        if (temp == ans) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an armstrong number");
        }


    }
}
