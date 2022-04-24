package com.company;

import java.util.Scanner;

public class perimeter_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = in.nextInt();
        System.out.println("Enter the breadth");
        int breadth = in.nextInt();
        double per = 2 * (length + breadth);
        System.out.println("The perimeter is " + per);


    }
}
