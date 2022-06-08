package com.company;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 12;
        System.out.println(linearSearch(arr,target,0,4));

    }

    static int linearSearch(int[] arr, int target, int start , int end) { //the parameters are really important
        if (arr.length == 0) {  //does not have bracket because it is a variable
            return -1;
        }

        //run a for loop
        for (int index = start ; index <= end; index++) {
            //check for element at every index if it equal to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; //this value will be returned if the element is not found in the array

    }
}