package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Leetcode problem (Difference between product and sum of the integers)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = in.nextInt();

        int add = 0;
        int mul = 1;

        while (num > 0) {
            int rem = num % 10;
            add = add  + rem; //mistake here,once again palindrome program (multiplied 10)
            mul = mul * rem;
            num = num / 10;

        }
        int result = mul - add;
        System.out.println("The result is " + result);
    }
}
