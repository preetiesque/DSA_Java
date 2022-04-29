package com.company;

import java.util.Scanner;

public class marks_grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = in.nextInt();
        String result = grade(marks);
        System.out.println("The grade is " + result);
    }

    static String grade(int marks) {
        if (marks <= 100 && marks > 90){
            return "AA";
        } else if (marks <= 90 && marks > 80){
            return "AB";
        } else if (marks <= 80 && marks > 70){
            return "BB";
        } else if (marks <= 70 && marks > 60){
            return "BC";
        } else if (marks <= 60 && marks > 50){
            return "CC";
        } else if (marks <= 50 && marks > 40){
            return "CD";
        } else {
            return "Fail";
        }
    }
}
