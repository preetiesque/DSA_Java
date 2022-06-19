package com.company;

public class peak_index_mount_array {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){  //{2,5,7,11,15,19,16,13,8,6,4,1,0} //13 elements
                //we are in decreasing part of the array
                // this might be the potential answer,but look at the left side
                end = mid ; //might be the answer hence not end = mid - 1
            } else {
                //we are in ascending part of the array
                start = mid + 1; //because we know that the mid + 1 element is greater than the mid element
                //arr[mid] < arr[mid + 1]
            }
        }
        //in the last when start == end,we have found out largest element in the mountain array
        //start and end are always trying to find the maximum element in the above two checks
        //hence when they are pointing to the same element,we have found our maximum element
        //more explanation : at a given point of time,both start and end have the best possible answer till that time

        return start; //can also return end as both of them are the same
    }
}
