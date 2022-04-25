package com.company;

import java.util.Scanner;

public class print_factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();

        for (int i = 1 ; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
