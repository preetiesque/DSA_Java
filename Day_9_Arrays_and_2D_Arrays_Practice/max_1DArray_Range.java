package com.company;

import java.util.Arrays;

public class max_1DArray_Range {
    public static void main(String[] args) {
        int[] arr = {3,24,76,12,43,73,45,20,84};
        System.out.println(Arrays.toString(arr));

        System.out.println(max_range(arr,0,8));
    }

    static int max_range(int[] arr , int start , int end){
        int max = arr[start];
        for (int i = start  ; i <= end ; i ++ ){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
