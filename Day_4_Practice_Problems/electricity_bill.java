package com.company;

import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to electricity bill generator!");
        System.out.println("Enter the units consumed in kWh : ");
        int unit = in.nextInt();


        if ( unit > 1 && unit < 100) {
            double amount = unit * 10;
            System.out.println("The electricity bill is : " + amount);
        } else if ( unit >= 100 && unit < 200) {
            double amount = 100 * 10 + (unit - 100) * 15;
            System.out.println("The electricity bill is : " + amount);
        } else if ( unit >= 200 && unit < 300) {
            double amount = 100 * 10 + (unit - 100) * 15 + (unit - 200) * 20;
            System.out.println("The electricity bill is : " + amount);
        } else {
            double amount = 100 * 10 + (unit - 100) * 15 + (unit - 200) * 20 + (unit - 300) * 25;
            System.out.println("The electricity bill is : " + amount);
        }

        //scope of integer amount is very important here
    }
}
