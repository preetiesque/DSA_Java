package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {12,14,7,15,18,19,43,53,65};
        int target =  19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    //separate function for searching
    //return the index if the element is found
    //return -1 if the element is not found
    static int linearSearch(int[] arr,int target){ //the parameters are really important
        if (arr.length == 0) {  //does not have bracket because it is a variable
            return -1;
        }

        //run a for loop
        for (int index = 0;index < arr.length; index++){
            //check for element at every index if it equal to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; //this value will be returned if the element is not found in the array
    }
}
//return true or false accordingly if element is not found
//return the element if it is found,search the target and return the element