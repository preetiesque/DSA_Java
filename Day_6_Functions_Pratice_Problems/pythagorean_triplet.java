package com.company;

import java.util.Scanner;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = in.nextInt();
        System.out.println("Enter number 2 : ");
        int b = in.nextInt();
        System.out.println("Enter number 3 : ");
        int c = in.nextInt();
        String result = triplet(a , b ,c);
        System.out.println(result);

    }

    static String triplet(int a , int b , int c){
        while ( a > 0 && b > 0 && c > 0) {
            int result = (a * a) + (b * b);
            if (c * c == result) {
                return "Pythagorean triplet";
            } else {
                return "Not a pythagorean triplet";
            }

        }
        return "Enter values other than 0";
    }
}
