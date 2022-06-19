package com.company;

public class first_and_last {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};

        //check for first occurence of the target element
        int start = search(nums,target,true);
        //check for last occurence of the target element
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }
    //this function just returns the index value of target which we are trying to find
    int search(int[] nums , int target , boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                //potential answer found
                ans = mid;
                if (findStartIndex == true){
                    end = mid - 1 ;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
        //UNDERSTAND PROPERLY

    }
}
