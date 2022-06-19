package com.company;

public class Infinite_Array {
    public static void main(String[] args) {
            int[] arr = {1,3,5,7,9,11,13,14,16,17,45,54,78,90,110,123,143,156};
            int target = 54;
        System.out.println(finding_range(arr,target));

    }

    static int finding_range(int[] arr,int target){
        //first find the range
        // start with a box/chunk of size 2;
        int start = 0;
        int end = 1;

        //condition for the target to lie in the given range
        while (target >= arr[end]){ //silly mistake here
            int newStart = end + 1;
            //double the box value
            // end = previous end + sizeofbox * 2
            end = end + ((end - start + 1) * 2); //using value of old start
            start = newStart;  //don't update value of start before using it actually
        }
        return binarysearch(arr , target , start , end);
    }

    static int binarysearch(int[] arr,int target,int start,int end){


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
        return -1;
    }
}
