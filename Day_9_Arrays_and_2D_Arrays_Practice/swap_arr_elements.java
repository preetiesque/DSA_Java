package com.company;

import java.util.Arrays;

public class swap_arr_elements {
    public static void main(String[] args) {
        //CODE TO SWAP ELEMENTS AT CERTAIN INDICES IN A GIVEN ARRAY
        int[] arr = {1,2,3,4,5,6};
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr,int index1 , int index2) { //important to mention []
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
