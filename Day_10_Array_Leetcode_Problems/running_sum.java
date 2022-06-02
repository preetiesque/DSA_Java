package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class running_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0 ; i < n ; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int[] res = (running_sum(nums));
        System.out.println(Arrays.toString(res));
    }
    static int[] running_sum(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for (int x = 1; x < arr.length ; x ++){
            ans[x] = ans[x-1] + arr[x];
        }
        return ans;
    }
}
