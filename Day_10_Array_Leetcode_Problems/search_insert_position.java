package com.company;

public class search_insert_position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(insert_search_position(arr,target));

    }
    static int insert_search_position(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        if (arr[end] < target){
            return arr.length;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
                if (arr[mid] == target){
                    return mid;
                } else if (arr[mid] > target){
                    res = mid;
                    end = mid - 1;
                } else if (arr[mid] < target){
                    start = mid + 1;
                }
            }
        return res;
    }
}
