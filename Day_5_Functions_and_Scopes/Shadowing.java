package com.company;

public class Shadowing {
    static int x = 90; //x will be available to everything which is inside the block of x
    //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //print 90
        int x ; //scope is overlapping
        //System.out.println(x); //shadowing begins from the point where it is being declared
        x = 40 ;               // scope will begin from where the variable is initialised
        System.out.println(x); //print 40
        fun();
    }
    //shadowing doesn't work in methods
    static void fun() {
        System.out.println(x); //no error because x is accessible to everything
        //will print the higher level x
    }
}
