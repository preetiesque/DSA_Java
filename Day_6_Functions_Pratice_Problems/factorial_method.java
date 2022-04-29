package com.company;

import java.util.Scanner;

public class factorial_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = in.nextInt();
        int fact = factorial(a);
        System.out.println("The factorial is : " + fact);
    }

    static int factorial(int a){
        int fact = 1;
        if (a >= 2 ){
            while ( a > 1) {
                fact = fact * a;
                a = a - 1;
            }   return fact;
        }
        return 1;
    }
}
