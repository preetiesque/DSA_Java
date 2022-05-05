package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class even_digits {
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
        System.out.println(find_nums(arr));
    }
    //METHOD TO CHECK THE NUMBER OF ELEMENTS IN THE ARRAY WHOSE DIGITS ARE EVEN
    static int find_nums(int[] arr){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            if (isEven(arr[i])){
                count ++;
            }
        }
        return count;
    }

    //METHOD TO CHECK WHETHER THE NUMBER OF DIGITS IN AN ELEMENT IS EVEN OR NOT
    static boolean isEven(int nums){
        int num_of_digits = number_of_digits(nums);
        if (num_of_digits % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    //METHOD TO COUNT THE NUMBER OF DIGITS IN AN ELEMENT IN AN ARRAY
    static int number_of_digits(int num){
        int count = 0;
        while (num > 0){
            count ++;
            num = num / 10;
        }
        return count;
    }
}
