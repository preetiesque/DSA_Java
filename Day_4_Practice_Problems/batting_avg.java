package com.company;

import java.util.Scanner;

public class batting_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of matches : ");
        int match = in.nextInt();
        float sum = 0;
        float temp = match;

        while (match > 0) {
            System.out.println("Enter the batting score : ");
            int score = in.nextInt();
            sum = sum + score;
            match = match - 1;

        }
        float avg = sum/temp;
        System.out.println("The batting average is " + avg);
    }
}
