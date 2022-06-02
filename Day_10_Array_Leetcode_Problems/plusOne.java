package com.company;

//leetcode
import java.util.Arrays;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int temp = num;
        int count = 0;
        while ( num > 0){
            num = num / 10 ;
            count++;
        }
        System.out.println(count);

        int[] arr = new int[count];

            while (temp > 0){
                for (int i = count - 1 ; i >= 0 ; i --){
                    int ans = temp % 10;
                    arr[i] = ans;
                    temp = temp / 10;
                }

            }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(plusOne(arr)));


    }

    static int[] plusOne(int[] arr){
        int[] array = new int[arr.length];
        for (int i = 0 ; i < arr.length - 1 ; i ++){
            array[i] = arr[i];
        }
        array[arr.length - 1] = arr[arr.length - 1] + 1;
        return array;
    }
}
