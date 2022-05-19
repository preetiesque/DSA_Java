package com.company;

public class n_and_double {
    public static void main(String[] args) {
         int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(n_double_exists(arr));
    }
    static boolean n_double_exists(int[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            arr1[i] = 2 * arr[i];
        }
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr.length ; j ++){
                if (arr[i] == arr1[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
