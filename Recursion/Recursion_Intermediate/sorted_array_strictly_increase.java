package com.company;

public class sorted_array_strictly_increase {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,7,11};
        System.out.println(is_Sorted(arr,0));

    }

    public static boolean is_Sorted(int[] arr,int index){
        if (index == arr.length - 1){
            return true;
        }
        if (arr[index] < arr[index + 1]){
            //array is striclty sorted till now
            return is_Sorted(arr,index+1);
        } else {
            return false;
        }
    }

}
