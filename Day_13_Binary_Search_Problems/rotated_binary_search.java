package com.company;
import java.util.Scanner;

public class rotated_binary_search {
    public static void main(String[] args) {
      int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
    //if we don't find a pivot it means that our array is not rotated
        if (pivot == -1){
            //just do normal binary search
            return binary_search(nums,target,0,nums.length-1);
        }
        //if we are able to find the pivot we have found two ascending sorted arrays
        if (nums[pivot] == target){
            return pivot;
        }
        if (target > nums[0]){
            return binary_search(nums,target,0,pivot-1);
        }
        return binary_search(nums,target,pivot + 1, nums.length - 1);
    }

    static int binary_search(int[] nums , int target , int start , int end){


        while (start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] < target ){
                start = mid + 1;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;
        while (start <= end){
             int mid = start + (end - start)/2;
            //4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]){ //index should not exceed the range
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            //case 3
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
