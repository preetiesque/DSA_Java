package com.company;

import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator!");
        System.out.println("Enter principle amount : ");
        int pri = in.nextInt();
        System.out.println("Enter rate of interest : ");
        float rate = in.nextFloat();
        System.out.println("Enter the time in years : ");
        int year = in.nextInt();

        float res = 1;
        float mul = 1 + rate/100;

        while ( year > 0) {
            res = res * mul;
            year = year - 1;
        }

        float amount = res * pri;
        float ci = amount - pri;

        System.out.println("The total amount is " + amount);
        System.out.println("The compound interest is " + ci);
    }
}
