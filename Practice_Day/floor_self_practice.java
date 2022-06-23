package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class floor_self_practice {
    public static void main(String[] args) {
        //SIMILAR TO CEILING OF NUMBER JUST RETURN END INSTEAD OF START
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array is ascending order : ");
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr));
        int result = floor_number(arr,target);
        System.out.println(result);

    }

    static int floor_number(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <=  end){
            int mid = start + (end - start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
