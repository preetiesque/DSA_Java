package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// for getting 2D array as an input
        Scanner in =new Scanner(System.in);

        int[][] arr = new int[4][4];  //way to create an array
        System.out.println(arr.length); //gives out the length of array

        /* [[a,b,c,d],
            [e,f,g,h],
            [i,j,k,l],     //2D Array Example
            [m,n,o,p]] */


        // INPUT FOR ADDING ELEMENTS TO THE ARRAY
        for (int row = 0 ; row < arr.length ; row ++) {
            for (int col = 0 ; col < arr[row].length ; col ++) {
                System.out.println("Enter your element : ");
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT FOR PRINTING OUT THE ELEMENTS OF THE ARRAY
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }


}
