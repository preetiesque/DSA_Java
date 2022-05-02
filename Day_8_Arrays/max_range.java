package com.company;

import java.util.ArrayList;

public class max_range {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,8};
        System.out.println(maxRange(arr,2,4));

    }
    //work on edge cases here,like array being null
    //imagine that array is not empty
    private static int maxRange(int[] arr,int start,int end) {
        int max = arr[start]; //
        for (int i = start ; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}

