package com.company.newpackage;

import static com.company.preeti.Message.message; //imports the message method from its respective package

public class greeting {
    public static void main(String[] args) {
        System.out.println("Hola!");
        message(); //initially will give an error if not imported
    }
}
