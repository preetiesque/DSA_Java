package com.company;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,8,9};


        reverse(arr,arr.length);

    }

    static void reverse(int[] arr , int n){
        int[] arr2 = new int[n]; //initialising an empty array
        int j = n; //indexing elements
        for (int i = 0 ; i < n ; i ++){
            arr2[j-1] = arr[i]; //consider j = 5
            j = j - 1; // here j = 4
        }
        System.out.println("The reversed array is : "); //scope is important here
        for (int k = 0 ; k < n ; k++){
            System.out.print(arr2[k] + " ");
        }
    }
}
