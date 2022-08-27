package com.company;

public class Bubble_Sort {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {8,1,3,7,2};

        //bubble sort
        //pairwise comparing and pushing the larger element at the next index ultimately putting largest element at the last

        //time complexity = O(n^2)
        //outer loop for counting i - 1 iterations
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            for (int j = 0 ; j < arr.length - i - 1 ; j ++){ //understanding how this works
                //no need to sort the elements which are already sorted at the last
                if (arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        print_Array(arr);
    }

    public static void print_Array(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i] + " ");
        }
    }

}
