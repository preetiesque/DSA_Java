package com.company;

import java.util.Scanner;

public class square_perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = in.nextInt();
        double perimeter = 4 * len;
        System.out.println("The perimeter " + perimeter);
    }
}
