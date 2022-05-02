package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class input_2D_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int[][] array2D = {
                {1,2,3},  //0th Index
                {4,5},    //1st Index
                {7,8,9,9} //2nd Index -> array2D[2] = {7,8,9,9}
        };*/

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //gives number of rows

        //input

        for (int row = 0; row < arr.length ; row++) {
            //for each column in the row
            for ( int col = 0; col < arr[row].length ; col++) {
                System.out.println("Enter the element : ");
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length ; row++) {
            //for each column in the row
            for ( int col = 0; col < arr[row].length ; col++) { //importance of indexing
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //output
        for (int[] ints : arr) {
            //for each column in the row
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a)); //enhanced for loop
        }


        /*for (int i =  0 ; i < array2D.length ; i ++) {
            array2D[i] = in.nextInt();
        }*/
    }
}
