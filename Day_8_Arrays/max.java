package com.company;

import java.util.ArrayList;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,8};
        System.out.println(max(arr));

    }
    //imagine that array is not empty
    private static int max(int[] arr) {
        int max = arr[0]; //
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
