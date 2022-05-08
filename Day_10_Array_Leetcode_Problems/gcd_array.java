package com.company;

public class gcd_array {
    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3};
        System.out.println(findGCD(arr));

    }
    static int findGCD(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] >= arr[0]){
                max = arr[i];
            }
        }
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] <= arr[0]){
                min = arr[i];
            }
        }
        while (max % min != 0){ //max will always be greater than min
            int rem = max % min;
            max = min;
            min = rem;
        }
        return  min;//return 1; MISTAKE
    }
}
