package com.company;

public class fibonacci_recurse {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int n = 7;
        print_fib(a,b,n-2);

    }

    public static void print_fib(int a , int b , int n){
        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.print(c + " ");
        print_fib(b,c,n-1);


    }

}
