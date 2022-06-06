package com.company;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
import java.util.Arrays;

public class even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {

                if (even(num)) {
                    count++;
                }

            }
        return count;
        }

    //function to check whether the element contains even number of digits or not
    static boolean even(int nums) {
           int num_of_digits = digits(nums);
           if (num_of_digits % 2 == 0){
               return true;
           } else {
               return false;
           }

    }

    //another function to count the digits of the element
    static int digits(int num){
        int count = 0;
        while (num > 0) { //do not miss the brackets
            count++;
            num = num / 10;
        }


        return count;

    }

}
