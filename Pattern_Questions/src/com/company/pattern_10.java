package com.company;

public class pattern_10 {
    public static void main(String[] args) {
        //butterfly pattern
        int n = 5;
        for (int i = 1 ; i <= n ; i ++ ){
            //for printing first part of stars - upper half - understand
            //printing 1st part
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            //printing spaces
            int spaces = 2 * (n-i);
            for (int j = 1 ; j <= spaces ; j ++){
                System.out.print(" ");
            }

            //printing 2nd part of first half
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            System.out.println();
        }

        //for printing the lower half
        for (int i = n ; i >= 1 ; i -- ){
            //for printing first part of stars - upper half - understand
            //printing 1st part
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            //printing spaces
            int spaces = 2 * (n-i);
            for (int j = 1 ; j <= spaces ; j ++){
                System.out.print(" ");
            }

            //printing 2nd part of first half
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
