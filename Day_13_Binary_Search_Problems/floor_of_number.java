package com.company;

public class floor_of_number {
    public static void main(String[] args) {
        // binary search

        int[] arr = {3,9,12,14,17,19,21,24,38,45,56};  //SORTED ARRAY ONLY
        int target = 45;
        int ans = floor_number(arr,target);
        System.out.println(ans);
    }
    //return the index of target element
    //return -1 if the element is not found in the array
    static int floor_number(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //finding the middle element
            //int middle = (start + end)/2; //becomes a problem because int has a fixed size
            //after sometime we cannot input value in int if we take a large value of array elements
            //might be possible that start + end may exceed the range of int in java
            int mid = start + (end - start) / 2; //silly mistake of adding - instead of +

            if (target > arr[mid]){   //mistake mid
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                //finding the answer
                return mid;
            }
        }
        return end;  //FOLLOW THE ALGORITHM THOUROUGHLY
    }
}
