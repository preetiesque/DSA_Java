package com.company;

import java.util.Scanner;

public class prism_volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base area of prism : ");
        int base_area = input.nextInt();
        System.out.println("Enter the height of prism : ");
        int height = input.nextInt();
        double vol = base_area * height;
        System.out.println("The volume of prism is " + vol);
    }
}
