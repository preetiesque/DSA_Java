package com.company;

import java.util.Scanner;

public class vol_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        int radius = in.nextInt();
        System.out.println("Enter the height of cylinder");
        int height = in.nextInt();
        double vol = (3.14 * radius * radius * height);
        System.out.println("The volume of cylinder is " + vol);




    }
}
