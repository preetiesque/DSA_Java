package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class two_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = in.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];
        for (int i = 0 ; i < arr.length ; i ++ ){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target : ");
        int target = in.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    static int[] twoSum(int[] arr , int target ){
        int[] ans = new int[2];
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr.length ; j ++){
                if (arr[i] + arr[j] == target){
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }
        return ans;
    }
}
