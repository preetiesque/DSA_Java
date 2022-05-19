package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class greatest_element_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int a = 0 ; a < arr.length ; a ++){
            arr[a] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int[] res = greatest_element(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] greatest_element(int[] arr){
        int[] array = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i ++){
            int count = 0;
            for (int j = 0 ; j < arr.length ; j ++){
                if (arr[i] > arr[j]){
                    count++;
                }
                array[i] = count;
            }
        }
        return array;
    }
}
