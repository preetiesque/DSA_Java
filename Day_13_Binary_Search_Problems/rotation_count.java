package com.company;

public class rotation_count {
    public static void main(String[] args) {
        //to find the number of times an array is rotated
        int[] arr = {4,5,6,7,0,1,2};
    }
    static int countRotations(int[] arr){
        int pivot = findPivot_with_Duplicates(arr);
        //if (pivot == -1){
            //array is not rotated
            //return 0;
        //}
        return pivot + 1;

    }
    static int findPivot_with_Duplicates(int[] arr){
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
            //if elements at middle ,start, end are equal just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                // NOTE : but what if these elements at the start and end were the pivots
                // hence first check whether the elements were pivots or not
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //now check whether the end element is pivot or not
                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side array is sorted so pivot should be in the right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
