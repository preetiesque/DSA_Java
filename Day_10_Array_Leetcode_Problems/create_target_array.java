package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class create_target_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = in.nextInt();
        //int[] target = new int[n];
        int[] nums = new int[n];
        int[] index = new int[n];
        System.out.println("Enter the elements which you want to add in the array : ");
        for (int a = 0 ; a < nums.length ; a ++){
            nums[a] = in.nextInt();
        }

        System.out.println("Enter the index positions where you want to add the element : ");
        while ( in.nextInt() < nums.length - 1 ) {
            for (int b = 0; b < index.length; b++) {
                index[b] = in.nextInt();
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(index));
    }
}
