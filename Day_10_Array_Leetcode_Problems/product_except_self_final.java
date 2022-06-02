package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class product_except_self_final {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(product_except_self(arr)));
    }
    //[1,2,3,4,5] should return [120,60,40,30,24]
    //[1,-1,0,3,-3] == [0,0,9,0,0]
    static int[] product_except_self(int[] arr){
        int prod = 1;
        boolean zero = false;
        int multipleZero = 0;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 0){
                zero = true;
                multipleZero++;
            } else {
                prod = prod * arr[i];
            }
        }
        int[] prodArray = new int[arr.length];
        if (multipleZero > 1){
            return prodArray;
        }

        for (int i = 0 ; i < arr.length ; i ++){
            if (!zero ){
                prodArray[i] = prod/arr[i];
            } else {
                if (arr[i] == 0){
                    prodArray[i] = prod;
                }
            }

        }
        return prodArray;
    }
}
