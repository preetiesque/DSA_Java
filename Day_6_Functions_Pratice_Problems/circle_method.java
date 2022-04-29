package com.company;

import java.util.Scanner;

public class circle_method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = in.nextInt();
        System.out.println("The circumference is " + circum(radius));
        System.out.println("The area is " + area(radius));

    }

    static double circum(int radius){
        double circum = 2 * 3.14 * radius;
        return circum;
    }

    static double area(int radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
