package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class input_1D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        int[] arr = new int[5];

        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
