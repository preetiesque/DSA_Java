package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search_self_practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array in ascending order : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int result = binary_search(arr,target);
        System.out.println(result);

    }

    static int binary_search(int[] arr , int target){
        int start = 0; //DEFINING THE TWO POINTER START AND END //MISTAKE WHILE DEFINING START POINTER
        int end = arr.length - 1;


        while (start <= end){
            int mid = start + (end - start) / 2 ; //WE WANT [START + END] / 2 ; SO OPTIMIZED FORM
            //DEFINE MID AT PROPER SCOPE
            if (target > arr[mid]){ //mistake mid again
                start = mid + 1;
            } else if (target < arr[mid]){ //important line
                end = mid - 1;
            } else {
                return mid;
            }

        }
         return -1;

    }
}
