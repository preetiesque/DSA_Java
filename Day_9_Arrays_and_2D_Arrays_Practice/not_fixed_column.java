package com.company;

import java.util.Arrays;

public class not_fixed_column {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,2,7,8,6},
                {3,4}
        };

        //PRINTING OUT OUR ARRAY WHOSE COLUMN NUMBER IS NOT FIXED
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
