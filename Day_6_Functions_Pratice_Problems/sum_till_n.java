package com.company;

import java.util.Scanner;

public class sum_till_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = in.nextInt();
        int result = sum_n(n);
        System.out.println("The sum is " + result);
    }

    static int sum_n(int n) {
        int sum = 0;
        while ( n > 0) {
            sum = sum + n;
            n = n - 1;
        }
        return sum;
    }
}
