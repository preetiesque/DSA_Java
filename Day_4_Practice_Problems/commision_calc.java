package com.company;

import java.util.Scanner;

public class commision_calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total sales generated : ");
        int sales = in.nextInt();
        System.out.println("Enter the commission percentage : ");
        float per = in.nextFloat();

        float com = sales * (per/100);

        System.out.println("The commission is " + com);
    }
}
