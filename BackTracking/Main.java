package com.company;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        print_permutations(str,"",0);

    }

    public static void print_permutations(String str , String perm , int index){
        if (str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0 ; i < str.length() ; i ++){
            char curr_char = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i + 1);
            print_permutations(newString , perm + curr_char , index + 1);

        }
    }

}
