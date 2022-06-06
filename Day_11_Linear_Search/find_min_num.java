package com.company;

import java.util.Arrays;

public class find_min_num {
    public static void main(String[] args) {
        int [] arr = {37,290,77,14,12,15,19};
        System.out.println(min(arr));
    }

    //assume arr.length != 0
    //return the minimum value present in array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0 ; i <arr.length ; i++) {
            if (arr[i] < ans ) {
                ans = arr[i]; //updating the value of answer
            }

        }
        return ans;

    }
}
