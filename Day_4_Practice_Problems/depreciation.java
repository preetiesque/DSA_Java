package com.company;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the original value : ");
        int value = in.nextInt();
        System.out.println("Enter the depreciation percentage : ");
        float dep = in.nextFloat();
        float depreciation = (dep/100) * value;
        float val = value - depreciation;

        System.out.println("The depreciated value is " + val);
    }
}
