package com.company;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,8};
       // swap(arr,1,2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr) {
        int start = arr[0];
        int end = arr.length-1;

        while (start < end) {
            //swap
            swap(arr,start,end);
            start ++ ;
            end -- ;
        }
    }


    static void swap(int[] arr , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2]; //take care while assigning values
        arr[index2] = temp;

    }

}
//check code
