package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class product_except_self_apart_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(product_except_self_apart_zero(arr)));
    }
    static int[] product_except_self_apart_zero(int[] arr){
        int prod = 1;
        for (int i = 0 ; i < arr.length ; i ++){

            prod = prod * arr[i]; //[1,2,3,4,5] = [120,60,40,30,24] //[1,3,0,3,1]

        }

        int[] prodArr = new int[arr.length];

        for (int j = 0 ; j < arr.length ; j ++){

                prodArr[j] = prod / arr[j];

        }
        return prodArr;
    }
}
