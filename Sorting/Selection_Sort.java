package com.company;

public class Selection_Sort {
    public static void main(String[] args) {
        //Selection Sort
        //Selecting the smallest number at putting it at front
        //one swap per one iteration ; with each iteration we take out the smallest element and swap it with the first position
        //comparing i with i+1

        //time complexity = (n^2)
        int[] arr = {7,8,2,1,3};
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            int smallest_index = i;
            for (int j = i + 1 ; j < arr.length ; j ++){
                if (arr[smallest_index] > arr[j]){
                    smallest_index = j;
                }
            }
            int temp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = temp;
        }
        print_Array(arr);
    }

    public static void print_Array(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
