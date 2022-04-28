package com.company;

public class String_Example {
    public static void main(String[] args) {
          String message = greet();
        System.out.println(message);
    }

    static String greet() { //silly mistake , no brackets
        String greeting = "How are you?";
        return greeting;
    }
}
