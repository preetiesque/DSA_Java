package com.company;

import java.lang.Math;

public class pairs_with_abs_diff {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int k = 1;
        System.out.println(pair_with_abs_diff(arr,k));

    }
    static int pair_with_abs_diff(int[] arr,int k){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = i + 1 ; j < arr.length ; j ++){
                if (Math.abs(arr[i] - arr[j]) == k){
                    count ++ ;
                }
            }
        }
        return 0;
    }
}
