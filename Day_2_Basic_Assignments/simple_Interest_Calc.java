package com.company;

import java.util.Scanner;

public class simple_Interest_Calc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");
        System.out.println("Enter principle amount");
        int p = in.nextInt();
        System.out.println("Enter time in years");
        int time = in.nextInt();
        System.out.println("Enter Rate of Interest");
        float rate = in.nextFloat();
        float si = (p * time * rate)/100;
        System.out.println("The simple interest is " + si);

    }
}
