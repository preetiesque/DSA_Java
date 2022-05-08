package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class good_pair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0 ; i < n ; i ++){
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        int res = (good_pairs(nums));
        System.out.println("Number of good pairs is : " + res);

    }
    static int good_pairs(int[] arr){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = i + 1 ; j < arr.length ; j ++){
                if (arr[i] == arr[j]){
                        count++;

                } //usage of while loop led to problem
            }
        }
        return count;
    }
}
