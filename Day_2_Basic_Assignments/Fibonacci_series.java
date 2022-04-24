package com.company;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
       int a = 0;
       int b = 1;
       int count = 2; //mistake - did not initialize the count


        while (count <= n ) {
            int temp = b; //mistake- assigned first number instead of second to temp
            a = a + b;  //mistake- adding b to a instead of doing reverse
            a = temp; // mistake - assigned first number instead of second to temp
            n++;
        }
        System.out.println(b); //mistake - printed first number instead of second and this belongs out of while
        //Find the nth Fibonacci number
        /*Scanner ch = new Scanner(System.in);
        System.out.println("Enter the nth Fibonacci number");
        int num = ch.nextInt();
        int first = 0;   *//* First two numbers *//*
        int second = 1;
        int count = 2; //We already have the first two numbers

        while (count <= num) {
            int temp = second; //the value of second get updated time to time as increment takes place
            second = second + first;
            first = temp; //previous value is taken
            count++; //Incrementing the count

        }
        System.out.println(second);  //the output(sum of two numbers) will always remain in second at the end
*/
    }
}
//rectify mistakes and concepts