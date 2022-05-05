package com.company;

import java.util.Scanner;

public class max_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,65,34},
                {43,78,36,77},
                {98,12}
        };

        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
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
