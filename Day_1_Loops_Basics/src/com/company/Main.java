package com.company;

public class Main {

    public static void main(String[] args) {
	// Conditional Statements
       int salary = 24000;
       /* if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);*/

        //Multiple If-Else statements
        if (salary > 10000 && salary < 20000) {
            salary += 2000;
        } else if(salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
