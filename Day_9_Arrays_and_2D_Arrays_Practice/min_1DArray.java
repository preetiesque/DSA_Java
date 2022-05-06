package com.company;

import java.util.Arrays;

public class min_1DArray {
    public static void main(String[] args) {
        int[] arr = {23,67,12,96,45,3,56};

        System.out.println(Arrays.toString(arr));

        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i ++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
