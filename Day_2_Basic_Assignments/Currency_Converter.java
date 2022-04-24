package com.company;

import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {

        Scanner cur = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter");
        System.out.println("Enter the value in rupees");
        int rupee = cur.nextInt();
        double dollar = 0.013 * rupee;
        System.out.println("The value in dollars is " + dollar);

    }
}
