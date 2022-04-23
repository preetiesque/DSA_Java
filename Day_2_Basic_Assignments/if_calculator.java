package com.company;

import java.util.Scanner;

public class if_calculator {
    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);


        //made mistake here ,if the operator is invalid still asks for number input
        //hence use bitwise operator for checking the input and use nested if for result display
        System.out.println("Enter the operator");
        char op = ch.next().trim().charAt(0); //important,remember this
        System.out.println("Enter the first number");
        int num1 = ch.nextInt();
        System.out.println("Enter the second number");
        int num2 = ch.nextInt();

        if (op == '+') {
            int result = num1 + num2;
            System.out.println(result);
        } else if (op == '-') {
            int result = num1 - num2;
            System.out.println(result);
        } else if (op == '*') {
            int result = num1 * num2;
            System.out.println(result);
        } else if (op == '/') {
            int result = num1 /num2;
            System.out.println(result);
        } else {
            System.out.println("Invalid!");
        }
    }
}
