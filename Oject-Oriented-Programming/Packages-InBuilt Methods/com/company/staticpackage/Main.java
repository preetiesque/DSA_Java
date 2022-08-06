package com.company.staticpackage;

public class Main {
    public static void main(String[] args) {
        //this is the actual class where we will  use our newly created class named Human_Class
        //we don't need to import it because it is in the same folder/package
        Human_Class preeti = new Human_Class(21,"Preeti Chaudhari",10000,false);
        Human_Class xyz = new Human_Class(25,"xyz",15000,true);
        Human_Class arpit = new Human_Class(24,"Arpit",20000,true);

        System.out.println(preeti.name);
        System.out.println(arpit.population);
    }

    //this is not dependant on objects because this is static
    //this does not belong to some instance
    static void fun(){
        System.out.println("Hello");
        //greeting(); -> this function which we are using inside a static context depends on instances

        //you cannot access non-static stuff without referencing their instances in a static context
        //and here we are referencing the non static stuff
        Main obj = new Main();
        obj.greeting();
        //System.out.println(this.greeting());
        //this keyword is dependant on the object so how can we use something which is dependant on object
        //inside something which is not dependant on objects?
        //this keyword specifically points to an object
    }

    //this is dependant on objects because this is not static
    //this belongs to some instance
    //something which is not static belongs to an object
    void greeting(){
        System.out.println("Hello");
        //you cannot use this non static method without specifying to which instance does this belongs to
        //but the static function(main) in  which we will be using this non static method does not depend on any instance/object
    }
}
