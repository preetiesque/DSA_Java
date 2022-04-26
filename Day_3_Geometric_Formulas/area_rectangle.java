package com.company;

import java.util.Scanner;

public class area_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int len = in.nextInt();
        System.out.println("Enter breadth");
        int breadth = in.nextInt();
        double area = len * breadth;
        System.out.println("The area is "+ area);
    }
}
