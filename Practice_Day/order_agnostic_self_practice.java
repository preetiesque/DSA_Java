package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class order_agnostic_self_practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = in.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int result = order_agnostic(arr,target);
        System.out.println(result);
    }

    static int order_agnostic(int[] arr, int target){
        int start = 0; //mistake arr[0]
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (arr[0] < arr[arr.length-1]){ //ASCENDING ARRAY
                if (target > arr[mid]){
                    start = mid + 1;
                } else if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

            else //if (arr[0] > arr[arr.length-1]){ //DESCENDING ARRAY
                if (target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        return -1;
        }

    }

