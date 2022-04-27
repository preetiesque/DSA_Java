package com.company;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            //int a = 0 ; //initialised outside the block in the same function(method),hence cannot be initialised again
            a = 100; //changing the original value,reassigning the original reference variable to other value
            int c = 99;
            //values initialised in a particular block will remain in that block
        }

        //System.out.println(c); // block scope
    }
}
