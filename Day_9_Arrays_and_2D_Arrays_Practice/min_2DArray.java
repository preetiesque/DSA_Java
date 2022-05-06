package com.company;

import java.util.Arrays;

public class min_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,45,68},
                {21,12,9},
                {32,1,7}
        };

        //2D ARRAY NEEDS TO BE PRINTED PROPERLY
        for ( int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println(min(arr));
    }

    static int min(int[][] arr){
        int min = arr[0][0];
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
