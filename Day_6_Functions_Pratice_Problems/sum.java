package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = in.nextInt();
        System.out.println("Enter number 2: ");
        int b = in.nextInt();
        int result = add(a,b);
        System.out.println("The addition is " + result);

    }
    static int add(int a , int b) {
        int add = a + b;
        return add;
    }

}
