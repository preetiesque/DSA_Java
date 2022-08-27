package com.company;

public class reverse_a_string {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        for (int i = 0 ; i < a.length()/2 ; i ++){
            int front = i;
            int back = a.length() - 1 - i;

            char frontChar = a.charAt(i);
            char backChar = a.charAt(back);

            a.setCharAt(front,backChar);
            a.setCharAt(back,frontChar);
        }

        System.out.println(a);
    }
}
