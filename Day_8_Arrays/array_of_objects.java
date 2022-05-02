package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class array_of_objects {
    public static void main(String[] args) {
        //ARRAY OF OBJECTS
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        //modifying the elements of array
        str [1] = "Preeti";       //changing the original object
        System.out.println(Arrays.toString(str));
    }
}
