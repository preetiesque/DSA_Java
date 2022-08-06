package com.company.staticpackage.singleton_example;

public class singleton_class {
    public static void main(String[] args) {
        //singleton obj = new singleton(); //since the class named singleton is not private we are able to create
                                         //as many as objects of type singleton unfulfilling the real purpose of the
                                         //singleton class
        //obj.num : we are unable to access this and this gives an error because num is made as private
        singleton obj = singleton.getinstance(); //getters and setters for private access modifiers

        singleton obj1 = singleton.getinstance(); //obj,obj1,obj2 refer to same instance of class singleton

        singleton obj2 = singleton.getinstance();

        //we are giving the same instance to obj,obj1,obj2 , because we are giving the same instances in the memory
    }
}
