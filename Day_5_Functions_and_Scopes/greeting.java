package com.company;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
    //greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) { //giving arguments
        String message = "Hello " + name;
        return message;

    }

    static void greeting() {
        System.out.println("Hello");
    }
}
