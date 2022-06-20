package com.company;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        //System.out.println(findPivot(arr)); //FINDING ONLY THE PIVOT ELEMENT
    }

    int findPivot(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while (start <= end){
            //4 cases over here
            int mid = start + (end - start) / 2 ;
            if (mid < end && arr[mid] > arr[mid + 1]){ //mid should always be less than end to prevent index out of bound
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //not work with duplicate values
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
          //if we don't find a pivot it means that the array is not rotated
        if (pivot == -1){
            //just do normal binary search
            binary_search(nums,target,0, nums.length - 1);
        }
        //if the pivot is found,we have found 2 ascending sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target > nums[0]){
            return binary_search(nums,target,0,pivot -1);
        }
        return binary_search(nums,target,pivot + 1,nums.length -1);
    }
    static int binary_search(int[] arr , int target,int start , int end){

        while (start <= end){
            int mid = start + (end - start) / 2 ; //WE WANT [START + END] / 2 ; SO OPTIMIZED FORM
            //DEFINE MID AT PROPER SCOPE
            if (target > arr[mid]){ //mistake mid again
                start = mid + 1;
            } else if (target < arr[mid]){ //important line
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}
