package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class transpose_matrix {
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
        System.out.println(transpose(arr));
    }
    static int[][] transpose(int[][] arr){
        int[][] arr1 = new int[arr[0].length][arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; i < arr[0].length ; j ++){ //arr[0].length important
                arr1[j][i] = arr[i][j];
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }
        return arr1;
    }
}

