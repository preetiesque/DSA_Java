package com.company;

public class swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        /* int temp;
        temp = a;   //how the values are being actually passed
        a = b;
        b = temp;
*/      swap(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
