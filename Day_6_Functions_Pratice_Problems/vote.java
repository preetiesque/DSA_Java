package com.company;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = in.nextInt();
        boolean result = age(age);
        System.out.println(result);
    }
    static boolean age(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
