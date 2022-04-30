package com.company;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = in.nextInt();
        System.out.println("Enter number 2 : ");
        int b = in.nextInt();
        int product  = product(a,b);
        System.out.println("The product is : " + product);


    }
    static int product(int a, int b) {
        int result = a * b;
        return result;
    }
}
