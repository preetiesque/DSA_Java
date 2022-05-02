package com.company;

public class Main {

    public static void main(String[] args) {
        // Array and array lists
        //syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
        int[] roll = new int[5];
        //direct method
        int[] roll2 = {23, 45, 34, 78, 45}; //leaving empty square brackets

        int[] rollno; //rollno is getting defined in the stack
        rollno = new int[5]; //initialisation:actual memory creation(actually here the object is being created in the heap memory)
        //if size of array is not specified we will get an error
        //System.out.println(roll2[3]);

        int[] ros; //declaration of an array
        ros = new int [5]; //object created in heap memory
        System.out.println(ros[3]); //all the elements are zeros by default

        String[] arr = new String[4]; //string array
        System.out.println(arr[2]); //gives null by default
        //null is a literal



    }
}
