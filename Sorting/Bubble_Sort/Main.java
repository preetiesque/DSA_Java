package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,3,0,0,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void selection(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            //find the maximum element in the remaining array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;

        for (int i = start ; i <= end ; i ++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubble(int[] arr){ //in place sorting algorithm,hence we don't return anything
        boolean swapped;
        //run the steps n-1 times,4th passes for an array of length 5.
        for (int i = 0 ; i < arr.length ; i ++){
            //for each step , max item will come at the last place
            swapped = false;
            for (int j = 1 ; j < arr.length - i ; j ++){ //or j <= arr.length - i - 1
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }
            if (!swapped){
                break;
            }
        }


    }
}
