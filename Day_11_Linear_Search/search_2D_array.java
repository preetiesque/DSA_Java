package com.company;

import java.util.Arrays;

public class search_2D_array {
    public static void main(String[] args) {
        int [][] arr = {  //new int[][] is not mandatory here
                {1,2,3},
                {5,6,7,8},
                {3,6,9,4}
        };
        int target = 7;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search (int[][]arr , int target){
        for (int row = 0 ; row < arr.length ; row ++){
            for (int col = 0 ; col < arr[row].length ; col ++){
                if (arr[row][col] == target) {
                    return new int[]{row,col}; //intialising a new array which gives us the answer
                }
            }
        }
        return new int[]{-1,-1};
    }

}
