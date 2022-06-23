package com.company;

import java.util.Arrays;

public class reverse_with_new_array {

    public static void main(String[] args) {
	     int[] arr = {1,2,3,4,5,6};

         int[] res = reverse(arr);
        System.out.println(Arrays.toString(res));


    }
    static int[] reverse(int[] arr){
        int j = arr.length;
        int[] ans = new int[j];
        for (int i = 0 ; i < arr.length ; i ++){
            ans[i] = arr[j-1]; //ans[j-1] = arr[i]; //very important line
            j = j - 1;
        }
        return ans;
    }
}
