package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        //ARRAY OF PRIMITIVES
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 44;
        arr[3] = 21;
        arr[4] = 61;
        // arr = [1,11,44,21,61]
        //System.out.println(arr[3]);

        //input using for loops
        for (int i = 0;i < arr.length;i++) {   //different for loop for taking inputs from user
            arr[i] =  in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        /*for (int i = 0;i < arr.length;i++) {   //different for loop for pritning out the elements of array
            System.out.print(arr[i] + " ");
        }

        for (int j : arr) {            //enhanced for loop
            System.out.print(j + " "); //here j represents element of the array
        }*/


    }
}
