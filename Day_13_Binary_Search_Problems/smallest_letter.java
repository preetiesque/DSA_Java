package com.company;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class smallest_letter {
    public static void main(String[] args) {

        char[] arr = {'c','f','j'};  //SORTED ARRAY ONLY
        char target = 'c';
        int ans = greatest_small_letter(arr,target);
        System.out.println(ans);
    }

    static int greatest_small_letter(char[] letters, char target){

        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            //finding the middle element
            //int middle = (start + end)/2; //becomes a problem because int has a fixed size
            //after sometime we cannot input value in int if we take a large value of array elements
            //might be possible that start + end may exceed the range of int in java
            int mid = start + (end - start) / 2; //silly mistake of adding - instead of +

            if (target < letters[mid]){   //mistake mid
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
