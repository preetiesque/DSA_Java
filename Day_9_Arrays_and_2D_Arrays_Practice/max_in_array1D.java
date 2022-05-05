package com.company;

import java.util.Arrays;

public class max_in_array1D {
    public static void main(String[] args) {
        int[] arr = {5,7,2,98,45,23,105,37,45};
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));

        /*int max = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.println(max);*/
    }

    static int max(int[] arr) {
        int max = 0;
        for (int i = 0 ; i < arr.length ; i ++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
