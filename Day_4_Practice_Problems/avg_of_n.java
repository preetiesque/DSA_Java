package com.company;

import java.util.Scanner;

public class avg_of_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers?  ");
        int num = in.nextInt();
        float temp = num;
        float sum = 0 ;

        while (num > 0 ) {
            System.out.println("Enter the number : ");
            int n = in.nextInt();
            sum = sum + n;
            num = num - 1;
        }
         float average = sum / temp ;  //created temporary variable as n value is decrementing
         System.out.println("The average is " + average);

    }
}
