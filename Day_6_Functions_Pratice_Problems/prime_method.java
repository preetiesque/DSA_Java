package com.company;

import java.util.Scanner;

public class prime_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = in.nextInt();
        System.out.println(prime(a));
    }

    static String prime(int a){
        if (a <= 1 ){
            return "Enter number other than 0 or 1";
        }
        int n = 2;
        while (n * n <= a) {
            if (a % n == 0) {
                return "Not Prime";
            } else {
                return "Prime";
            }
        }
        return "Prime";
    }
}
