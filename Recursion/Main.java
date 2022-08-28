package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 5 ;
    Print_Num(n);

    }

    public static void Print_Num(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        Print_Num(n-1);
    }

}
