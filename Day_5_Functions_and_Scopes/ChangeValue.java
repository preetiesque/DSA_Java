package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array

        int arr[] = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    //function outside main function
    static void change(int[] nums) {
        nums[0] = 99;
    }
}
