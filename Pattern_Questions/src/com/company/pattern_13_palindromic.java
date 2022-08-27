package com.company;

public class pattern_13_palindromic {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 1 ; i <= n ; i ++){
            //spaces
            for (int j = 1 ; j <= n - i ; j ++){
                System.out.print(" ");
            }

            //printing first half of numbers
            for (int j = i ; j >= 1 ; j --){
                System.out.print(j);
            }

            //printing 2nd half of numbers
            for (int j = 2 ; j <= i ; j ++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
