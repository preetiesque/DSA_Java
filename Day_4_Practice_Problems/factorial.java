package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        int fact = 1;

        while ( num > 0) {
            fact = fact * num ;
            num = num - 1 ;
        }
        System.out.println("The factorial value is " + fact);
    }
}
