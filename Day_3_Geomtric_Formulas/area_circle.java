package com.company;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius of the circle");
        int radius = in.nextInt();
        double area = pi * radius * radius;
        System.out.println("The area is " + area);


    }
}
