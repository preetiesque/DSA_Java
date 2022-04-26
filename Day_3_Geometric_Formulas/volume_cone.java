package com.company;

import java.util.Scanner;

public class volume_cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cone");
        int radius = in.nextInt();
        System.out.println("Enter the height of cone");
        int height = in.nextInt();
        double volume = (3.14 * radius * radius * height) / 3;
        System.out.println("The volume of the cone is " + volume);

    }
}
