package com.company;

import java.util.Scanner;

public class perimeter_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = in.nextInt();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter is " + perimeter);

    }
}
