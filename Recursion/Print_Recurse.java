package com.company;

public class Print_Recurse {
    public static void main(String[] args) {
        int n = 1 ;
        Print_Num(n);
    }

    public static void Print_Num(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        Print_Num(n+1);
    }
}
