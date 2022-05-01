package com.company;

import java.util.Scanner;

public class enhanced_week {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);

        System.out.println("Enter the day");

        int day = ch.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday :(");
            case 6, 7 -> System.out.println("Weekend!!!  :)");
        }
    }
}
