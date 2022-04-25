package com.company;

import java.util.Scanner;
public class avg_marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many subjects ? ");
        int sub = in.nextInt();
        float sum = 0;
        float temp = sub;

        while (sub > 0 ) {
            System.out.println("Enter subject marks : ");
            float marks = in.nextFloat();
            sum = sum + marks;
            sub = sub - 1 ;


        }
        float avg = sum/temp;
        System.out.println("The average marks is " + avg);
    }
}
