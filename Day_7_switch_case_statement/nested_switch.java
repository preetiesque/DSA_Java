package com.company;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int id = in.nextInt();

        String dept = in.next();

        switch(id) {
            case 1:
                System.out.println("Preeti");
                break;
            case 2:
                System.out.println("Kiran");
                break;
            case 3:
                System.out.println("Student number 3");
                switch(dept) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "Electrical":
                        System.out.println("Electrical");
                        break;
                    default:
                        System.out.println("None");

                }
                break;
            default:
                System.out.println("None");
        }
    }
}

//Understand the flow of nested switch case properly,avoid any mistakes
