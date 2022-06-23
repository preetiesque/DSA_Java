package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ceiling_self_practice {
    public static void main(String[] args) {
        //CEILING IS THE SMALLEST NUMBER WHICH IS EQUAL TO OR GREATER THAN OUR TARGET
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in ascending order : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int result = ceiling_number(arr,target);
        System.out.println(result);

    }
    static int ceiling_number(int[] arr, int target){
        //CHECKING ALL THE POSSIBILITIES //RETURNING THE UPDATES START HERE INSTEAD OF MID(TARGET INDEX)
        if (target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2 ;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start; //RETURNING THE UPDATED START HERE INSTEAD OF MID(INDEX OF TARGET ELEMENT) HERE
        //WE HAVE TO FIND THE SMALLEST NUMBER WHICH IS GREATER THAN OUR TARGET ELEMENT
    }
}
