package com.company;

import java.util.Arrays;

public class max_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,5,4},
                {3,6,12},
                {15,16},
                {31,55,28,19}
        };
        System.out.println(max(arr));

    }
    static int max(int[][] arr) {
        int ans = arr[0][0];
        for (int row = 0 ; row < arr.length ; row ++) {
            for (int col = 0 ; col < arr[row].length ; col ++) {
                if (arr[row][col] > ans) {
                    ans = arr[row][col];
                }
            }
        }
        return ans;
    }
}
