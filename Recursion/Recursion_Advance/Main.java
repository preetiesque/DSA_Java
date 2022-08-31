package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "abc";
        print_permutations(str,"");

    }

    public static void print_permutations(String str , String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0 ; i < str.length() ; i ++){
            char curr_char = str.charAt(i);
            //"abc" -> "bc"
            String newString = str.substring(0 , i) + str.substring(i + 1);
            print_permutations(newString , permutation + curr_char);
        }
    }
}
