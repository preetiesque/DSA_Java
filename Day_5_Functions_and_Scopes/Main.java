package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Functions(methods) in java

        //sum(); //calling the function
        /*int ans = sum2();
        System.out.println(ans);*/
        int ans = sum3(20,39); //passing the parameters
        System.out.println(ans);

    }
    //new function to be defined after the main() function,keep in mind the brackets

    //passing the value of numbers when we call the method in main()
    static  int sum3(int a,int b) { //mistake here not specifying parameters properly
        int sum = a + b;
        return sum;
    }


    //return the value
    static int sum2() {  //specifying the return type
        Scanner in = new Scanner(System.in);  //This statement should be defined in our new function strictly
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int add = num1 + num2;
        return add;  //value of the function call , also implies end of the function
    }
    static void sum() {
        Scanner in = new Scanner(System.in);  //This statement should be defined in our new function strictly
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int add = num1 + num2;
        System.out.println("The sum is " + add);

    }

}


/*
       access modifiers   return type name() {
       body
       return statement;
    }

     */
