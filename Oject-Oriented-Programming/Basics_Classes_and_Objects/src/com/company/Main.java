package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Classes - defining a data type of their own
        Student[] students = new Student[5]; //Student is the name of the class
        //name of a class should always begin with capital letter
        Student preeti = new Student(15,"Preeti C",89.6f);//whenever new object will be created it will go to the constructor
        System.out.println(preeti.rno);
        System.out.println(preeti.name);
        System.out.println(preeti.marks);
        //this points to preeti or replaced by preeti
        //Student shruti = new Student(17,"Shruti S",85.7f);
        //System.out.println(shruti.rno);
        //System.out.println(shruti.name);
        //System.out.println(shruti.marks);

        //preeti.greeting();
        //making static???
        //preeti.rno = 13;
        //preeti.name = "Preeti Chaudhari";
        //preeti.marks = 90.1f;
        //is it not possible to set the values of instance variables when we declare the reference
        //variable itself??
        //yes,Constructors
        //preeti.changeName("Shreya");
        //preeti.greeting();

        //System.out.println(Arrays.toString(students)); //prints out null because the properties have not set
        //the variable has not been initialized
        Student random = new Student(preeti);
        System.out.println(random.name);
        System.out.println(random.rno);
        System.out.println(random.marks);

        Student random2 = new Student(); //here in this case the empty contructor which we formed;
        //`this` keyword is replaced with the Class name Student(not random2 - the reference variable)
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "something!";
        System.out.println(two.name);

          final A pqr = new A("new name");
          pqr.name = "other name";
         // pqr = new A("new object"); //this cannot be done due to the final keyword
        //when a non primitive is final we cannot reassign it.
        //we can change the values,but we cannot reassign it.

        A obj;
        for (int i = 0 ; i < 100000000 ; i ++){
            obj = new A("Radom name");
        }
    }


    //create a class //syntax for creating a class
    //for every single student,this is the format
    static class Student {
        int rno;
        String name;
        float marks;  //this is just a template

        void greeting(){
            System.out.println("Hello! My name is " + name);
        }

        void changeName(String newName){
             name = newName;
        }

        /*Student () {
            this.rno = 13;
            this.name = "Preeti Chaudhari";
            this.marks = 98.2f;
        }*/

        Student(){ //empty constructor
            //this is how call one constructor from another constructor
            this(19,"default person",100.0f);
            //Internally new Student(19,"default person",100.0f);
            //now this will refer to the default constructor (the most bottom one)
        }

        Student (Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
        //Student arpit = new Student(17,"Arpit R",79.6)
        //reference variable is arpit and using `this` keyword we can assign values to the instance variables
        //this will be replace by the reference variable - arpit
        Student(int rno , String name , float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }


    }

    static class A {
        final int num = 10;
        String name;

        public A(String name){
            this.name = name;
            //System.out.println("Object is being created");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
    //we need a way to add the values of the properties object by object


}
