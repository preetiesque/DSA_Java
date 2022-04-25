package com.company;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = in.next().trim().charAt(0);

        if (ch == 'a') {
            System.out.println("Vowel");
        } else if (ch == 'e') {
            System.out.println("Vowel");
        } else if (ch == 'i') {
            System.out.println("Vowel");
        } else if (ch == 'o') {
            System.out.println("Vowel");
        } else if (ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
