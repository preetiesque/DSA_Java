package com.company;

public class print_keypad_Combination {

    public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void main(String[] args) {
        String str = "24";
        print_combination(str,0,"");

    }

    public static void print_combination(String str , int index , String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }

        char curr_char = str.charAt(index);
        String mapping = keypad[curr_char - '0'];

        for (int i = 0 ; i < mapping.length() ; i ++){
            print_combination(str , index + 1 , combination + mapping.charAt(i));
        }
    }
}
