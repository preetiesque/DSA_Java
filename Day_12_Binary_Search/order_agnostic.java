package com.company;

public class order_agnostic {
    public static void main(String[] args) {
           int[] arr = {98,87,65,59,54,47,43,32,29,17,8,4,2,0};
           int target = 29;
        System.out.println(order_agnostic_bs(arr,target));
    }
    static int order_agnostic_bs(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

         //find whether the array is sorted in ascending or descending order

        boolean isAsc;
        if ( arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end){
            //finding the middle element
            //int middle = (start + end)/2; //becomes a problem because int has a fixed size
            //after sometime we cannot input value in int if we take a large value of array elements
            //might be possible that start + end may exceed the range of int in java
            int mid = start + (end - start) / 2; //silly mistake of adding - instead of +

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                //IF ARRAY IS SORTED IN ASCENDING ORDER
                if (target > arr[mid]){   //mistake arr[mid]
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //IF ARRAY IS SORTED IN DESCENDING ORDER
                if (target > arr[mid]){
                    end = mid -1;
                } else {                      //if (target < arr[mid])
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}
