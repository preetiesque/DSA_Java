package com.company;

public class String_Rev_Recurse {
    public static void main(String[] args) {
        String str = "abcd";
        print_reverse(str,str.length()-1);

    }

    public static void print_reverse(String str , int index){
        if (index == 0){
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(index));
        print_reverse(str,index-1);

    }

}
