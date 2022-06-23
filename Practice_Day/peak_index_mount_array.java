package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class peak_index_mount_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in mountain array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the mountain array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int result = peak_index(arr);
        System.out.println(result);
    }

    static int peak_index(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){  //{2,5,7,11,15,19,16,13,8,6,4,1,0} //13 elements
                //we are in ascending part of the array
                start = mid + 1;
            } else {
                //we are in descending part of the array //arr[mid] > arr[mid + 1]
                end = mid;
            }
        }
        return start;
    }
}
