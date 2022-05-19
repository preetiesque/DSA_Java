package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class house_robber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of houses : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the money in each house : ");
        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(rob(nums));
    }

    static int rob(int[] nums){
        int total0 = 0;
        int total1 = 0;
        for (int i = 0 ; i < nums.length ; i = i + 2){
            total0 = total0 + nums[i];
        }
        for (int j = 1 ; j < nums.length ; j = j + 2){
            total1 = total1 + nums[j];
        }

        if (total0 > total1){
            return total0;
        } else {
            return total1;
        }

    }
}
