package com.company;

public class split_arr_sum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
          int start = 0;
          int end = 0;

          for(int i = 0 ; i < nums.length ; i ++){
              start = Math.max(start , nums[i]); //at the end of loop this will contain the maximum value of the array
              end = end + nums[i];
          }

          //binary search
        while (start < end){
            //try for middle as the potential answer
            int mid = start + (end - start)/2;

            //calculate how many pieces we can divide the array into to get the maximum sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if (sum + num > mid){
                    //we cannot add this in the subarray,we have to make a new one
                    //consider if we add this in the new subarray ,then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum = sum + num;
                }

            }
            if (pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end; //at the end the start and end will  be the same
    }
}
