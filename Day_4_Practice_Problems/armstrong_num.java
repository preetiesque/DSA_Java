package com.company;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = in.nextInt();
        int ans = 0;

        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            ans = ans + (rem * rem * rem);
            num = num / 10;
        }

        if ( ans == temp) {
            System.out.println("Armstrong number!");
        } else {
            System.out.println("Not an armstrong number!");
        }
    }
}
