package com.company;

public class Sum_Recurse {
    public static void main(String[] args) {
    Print_Sum(1,5,0);
    }

    public static void Print_Sum(int i , int n , int sum){
        if (i == n){
            //do not return simply ,we are yet to print the output
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Print_Sum(i + 1 , n , sum);
        System.out.println(i);
    }

}
