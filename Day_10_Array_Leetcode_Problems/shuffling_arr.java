package com.company;
//leetcode problem
import java.util.Arrays;
import java.util.Scanner;

public class shuffling_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the even number of elements in Array : ");
        int n = in.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < n ; i ++){
            num[i] = in.nextInt();
        }

        int[] res = shuffle_arr(num);
        System.out.println(Arrays.toString(res));

    }
    static int[] shuffle_arr(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        res[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1 ; i < arr.length - 1 ; i ++){
            if (i % 2 == 0){
                res[i] = arr[i/2]; // res[i] = arr[arr.length/2];
            } else {
                res[i] = arr[(i + (arr.length - 1)) / 2];    //res[i] = arr[((arr.length-1)/2) + i];
            }
        }


        //for (int a = 1 ; a < arr.length/2 ; a ++){
            //res[a] = arr[arr.length/2];
        //}
        return res;
    }
}
