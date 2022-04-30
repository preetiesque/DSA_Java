package com.company;

import java.util.Scanner;

public class minimum_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = in.nextInt();
        System.out.println("Enter number 2 : ");
        int b = in.nextInt();
        System.out.println("Enter number 3 : ");
        int c = in.nextInt();

        int num = min(a,b,c);
        System.out.println("The minimum number is " + num);
    }

    static int min(int a ,int b,int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
}
