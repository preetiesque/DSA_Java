package com.company;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 10; //as a primitive
        int b = 20;

        //Integer num = new Integer(45);
        Integer num = 45; //as an object;wrapper class;has its own properties
        swap(a,b);
        System.out.println(a + " " + b);

        Integer p = 40;
        Integer q = 60;

        swap2(p,q);
        System.out.println(p + " " +q);

    }
    public static void swap(int a , int b){
        int temp = a;
        a = b ;
        b = temp;
    }

    public static void swap2(int a , int b){
        int temp = a;
        a = b;
        b = temp;


    }
}
