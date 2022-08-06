package com.company.staticpackage;

//this is a demo to show the initialization of static variables
public class static_initialization {
        static int a = 4; //these two static variables are not dependant on objects
        static int b;

        //static block
        //this will only run for once , when the object is first created , when the class is loaded for the first time
        // we can see that I am inside static is running only for once
        static {
            System.out.println("I am inside static");
            b = a * 6;
        }

    public static void main(String[] args) {
        //we can have this inside this class because psvm is static
        static_initialization obj = new static_initialization(); //created a new object
        System.out.println(static_initialization.a + " " + static_initialization.b);

        static_initialization.b += 3;

        static_initialization obj2 = new static_initialization(); //created one more object
        System.out.println(static_initialization.a + " " + static_initialization.b);
    }


}
