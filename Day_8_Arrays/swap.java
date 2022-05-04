package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,8};
        swap(arr,1,2);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2]; //take care while assigning values
        arr[index2] = temp;

    }
}
