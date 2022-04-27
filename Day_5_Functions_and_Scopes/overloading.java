package com.company;

public class overloading {
    public static void main(String[] args) {
         fun(7);
         fun("Preeti");
    }
    static void fun(int a){
        System.out.println(a);

    }

    static void fun(String b){
        System.out.println(b);
    }
}
