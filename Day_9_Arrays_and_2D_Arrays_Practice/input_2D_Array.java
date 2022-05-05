package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class input_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your elements : ");
        int[][] arr = new int[3][3];

        //input
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                arr[row][col] = in.nextInt();
            }

        }
        //output (different loops for input and output)
        for (int row = 0 ; row < arr.length ; row ++) {
            for (int col = 0 ; col < arr[row].length ; col ++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
