package com.company;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of base");
        int base = in.nextInt();
        System.out.println("Enter the height");
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area is " +area);
    }
}
