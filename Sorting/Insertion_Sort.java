package com.company;

public class Insertion_Sort {
    public static void main(String[] args) {
        //Insertion Sort
        //Assuming a part is sort and another one is unsorted
        //inserting unsorted elements at their respective correct position
        int[] arr  = {7,1,3,8,2};
        for (int i = 1 ; i < arr.length ; i ++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        print_Array(arr);
    }

    public static void print_Array(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
