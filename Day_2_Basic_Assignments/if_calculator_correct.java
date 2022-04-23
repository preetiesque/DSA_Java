package com.company;

import java.util.Scanner;

public class if_calculator_correct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the operator");
        char op = in.next().trim().charAt(0);

        if (op == '+' || op =='-' || op == '*' || op == '/') {
            System.out.println("Enter first number");
            int num1 = in.nextInt();
            System.out.println("Enter second number");
            int num2 = in.nextInt();

            if (op == '+') {
                int result = num1 + num2 ;
                System.out.println(result);
            } else if (op == '-') {
                int result = num1 - num2 ;
                System.out.println(result);
            } else if (op == '*') {
                int result = num1 * num2 ;
                System.out.println(result);
            } else {
                int result = num1 / num2 ;
                System.out.println(result);
            }
        } else {
            System.out.println("Invalid Operator!");
        }
    }
}
