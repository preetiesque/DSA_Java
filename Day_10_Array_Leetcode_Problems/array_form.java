package com.company;
import java.util.*;

public class array_form {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i ++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the value of k which is to be added in array form : ");
        int k = in.nextInt();

        System.out.println(Arrays.toString(arr)); //Input: num = [2,7,4], k = 181 Output: [4,5,5] Explanation: 274 + 181 = 455
        System.out.println(arraySum(arr,k));

    }
    static List<Integer> arraySum(int[] arr, int target){
        double number = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            number = number + (arr[i] * Math.pow(10,(arr.length - 1) - i));
        }
        double arraySum = number + target;
        long value = (long)(arraySum);  //typecasting
        int finalvalue = (int)(value);
        //return (int)(arraySum);
        ArrayList<Integer> list = new ArrayList<>();
        while (finalvalue > 0){
            list.add(finalvalue % 10);
            finalvalue = finalvalue / 10;
        }
        Collections.reverse(list);
        return list;

    }


}
