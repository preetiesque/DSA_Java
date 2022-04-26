package com.company;

import java.util.Scanner;

public class area_equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length");
        int side = in.nextInt();
        double area =  ( (1.732) * (side * side) ) / 4 ;
        System.out.println("The area is " + area);
    }
}
