package com.company.staticpackage;

public class inner_classes {
       static class Test{ //if we put static here then it is not dependant on the outer class
                         //if we don't put static here then we will get error when we create an object;passed with parameters
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Preeti");
        Test b = new Test("Shreya"); //this will give us error because Test is an inner class.
        //it is itself dependant on the outside class
        //if we put it outside the above lines work fine
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
