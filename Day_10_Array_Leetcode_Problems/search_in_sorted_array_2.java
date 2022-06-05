package com.company;

public class search_in_sorted_array_2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 7;
        System.out.println(search_in_rotated_arr(arr,target));

    }
    static boolean search_in_rotated_arr(int[] arr, int target){
        int pivot = pivot_index(arr);
        if (pivot_index(arr)  == -1){
            return binary_search(arr,target,0,arr.length-1);
        } else if (target == arr[pivot]){
            return true;
        } else if (target > arr[0]){
            return binary_search(arr,target,0,pivot-1);
        } else {
            return binary_search(arr,target, pivot,arr.length-1);
        }

    }
    static boolean binary_search(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return true;
            } else if (arr[mid] > target){
                end  = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    static int pivot_index(int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start + (end - start)/2;
            int prev = (mid + arr.length - 1) % arr.length ;
            int next = (mid + 1) % arr.length ;

            if (arr[mid] < arr[prev] && arr[mid] < arr[next]){
                return mid;
            } else if (arr[end] < arr[mid]){
                start = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        }
        return -1;
    }
}
