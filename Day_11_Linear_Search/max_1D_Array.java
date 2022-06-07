package com.company;

public class max_1D_Array {
    public static void main(String[] args) {
        int[] arr = {23,12,3,45,76,1,67,765};

        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > ans ) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
