package com.company;

import java.util.Scanner;

public class sum_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        System.out.println("Enter the number");
        int num = in.nextInt();


        while ( num != 0) {

            ans = ans + num;
            System.out.println("Enter the number"); // take input unless the user enters 0
            num = in.nextInt();
        }
        System.out.println("The answer is " + ans);
    }
}    //very very important to understand the flow of program
