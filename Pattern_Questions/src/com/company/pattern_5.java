package com.company;

public class pattern_5 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1 ; i <= n ; i ++){
            //inner loop separate for space and separate for star

            for (int j = 1 ; j <= n-i ; j ++){
                System.out.print(" ");
            }
            //scope - till when the variable is stored in the memory
            //inner loop for printing stars
            for (int j = 1 ; j <= i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
