package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(linear_search(arr,target));

    }
    static int linear_search(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0 ; index < arr.length ; index ++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
