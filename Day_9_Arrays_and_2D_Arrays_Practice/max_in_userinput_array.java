package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class max_in_userinput_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = in.nextInt();
        System.out.println("Enter number of columns : ");
        int col = in.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter the elements : ");

        //input from user
        for (row = 0 ; row < arr.length ; row ++){
            for (col = 0 ; col < arr[row].length ; col ++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for (row = 0 ; row < arr.length ; row ++){
            for (col = 0 ; col < arr[row].length ; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        int result = max_2D_arr(arr);
        System.out.println("The maximum number in this 2D Array is " + result);
    }

    static int max_2D_arr(int[][] arr){
        int max = arr[0][0];
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
