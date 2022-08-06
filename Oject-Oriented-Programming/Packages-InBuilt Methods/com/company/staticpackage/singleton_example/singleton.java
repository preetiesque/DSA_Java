package com.company.staticpackage.singleton_example;

public class singleton {
    private int num = 0;
    private singleton(){
        //private means this class will be used in this particular java file only
    }

    public static singleton instance; //the goal is to create a single instance of the class singleton

    public static singleton getinstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    } //making it private creates problems
    // check whether only 1 instance is created or not
    //create one object in case if it does not have one


}
