package com.company;

import java.util.Arrays;

public class variable_Args {
    public static void main(String[] args) {
       fun(1,2,4,6,3,7,6,7,4);
       multiple(1,2,"Preeti","Prateek","Riya"); //in proper order
    }

    static void fun(int ...a) { //variable arguments //internally taken as array of int
        System.out.println(Arrays.toString(a));

    }

    static void multiple(int a,int b,String ...v) { //variable length arguments always at the end

    }//multiple types of arguments
}
