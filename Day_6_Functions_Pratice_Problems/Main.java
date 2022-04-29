package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Maximum function
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a = in.nextInt();
        System.out.println("Enter number 2 :");
        int b = in.nextInt();
        System.out.println("Enter number 3 :");
        int c = in.nextInt();

        int num = max(a,b,c);
        System.out.println("The maximum number is " + num);
    }

    static int max(int a , int b , int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c){
            return b;
        } else {
            return c;
        }


    }
}
