package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class plus_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int[] result = num_array(num);
        //int[] final = plus_One(result);

    }


    static int[] num_array(int num){
        int temp = num;
        int count = 0 ;
        while (num > 0){
            num = num / 10 ;
            count ++;
        }
        int[] num_array = new int[count];   // 574 = [5,7,4]

        while(temp > 0){
            for (int i = num_array.length - 1; i >= 0 ; i -- ){
               int ans = temp % 10;
               num_array[i] = ans;
               temp = temp / 10;
            }
        }

        return num_array;
    }

    static int[] plusOne(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] < 9) { //important condition
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] ans = new int[arr.length + 1];
        ans[0] = 1;









        /*if (arr[arr.length - 1] == 9){
            int[] array = new int[2];
            array[0] = 1;
        } else {
            int[] array = new int[arr.length];
            for (int i = 0 ; i < arr.length - 1 ; i ++){
                array[i] = arr[i];
            }
            array[arr.length - 1] = arr[arr.length - 1] + 1;
        } */

        return ans;
    }



}
