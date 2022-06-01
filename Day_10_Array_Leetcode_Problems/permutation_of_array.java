package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class permutation_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(permutation(arr)));
    }

    static int[] permutation(int[] arr){
        int[] permutation = new int[arr.length];
        for (int i = 0 ; i < permutation.length ; i ++){
            permutation[i] = arr[arr[i]];
        }
        return permutation;
    }
}
