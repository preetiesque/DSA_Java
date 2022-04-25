package com.company;

import java.util.Scanner;

public class dist_bw_points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first point : ");
        float pt1 = in.nextFloat();
        System.out.println("Enter the second point : ");
        float pt2 = in.nextFloat();

        float dist = pt2 - pt1 ;
        System.out.println("The distance between two point is " + dist);

    }


}
