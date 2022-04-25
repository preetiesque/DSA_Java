package com.company;

import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = in.nextInt();
        int result = 1; //initialising this is very important

        while (exp > 0) {
            result = result * num ; //very important to understand statement here,very simple statement
            exp = exp - 1 ;
        }

        System.out.println("The value is " + result);
    }  //practice
}
