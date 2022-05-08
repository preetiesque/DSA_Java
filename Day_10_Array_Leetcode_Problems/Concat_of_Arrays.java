package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Concat_of_Arrays {
    public static void main(String[] args) {
	// CONCATENATION OF ARRAY
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements : ");
        for ( int a = 0 ; a < nums.length ; a ++){
            nums[a] = in.nextInt();
        }
        System.out.println(Arrays.toString(concat_arr(nums)));

    }
    static int[] concat_arr(int[] arr){ //very important parameter ,define parameters and variables accordingly
        int[] ans = new int[2 * arr.length];
        for (int i = 0 ; i < arr.length ; i ++){  //throws exception //divide by 2 to exceed bounds
            ans[i] = arr[i];   //upper line to be iterated only three times
            ans[arr.length+i] = arr[i];
        }
        return ans;
    }
}
