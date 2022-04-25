package com.company;

import java.util.Scanner;

public class max_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;

        System.out.println("Enter your number : ");
        int num = in.nextInt();

        while (num != 0) {
             if (num > max) {
                 max = num;
             }
            System.out.println("Enter your number");
             num = in.nextInt();
        }
        System.out.println("The maximum number is " + max);
    }
}
