package com.company;

import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = num.nextInt();
        System.out.println("Enter number 2");
        int num2 = num.nextInt();

        if (num1 > num2) {
            System.out.println("Number 1 is max");
        } else {
            System.out.println("Number 2 is max");
        }
    }
}
