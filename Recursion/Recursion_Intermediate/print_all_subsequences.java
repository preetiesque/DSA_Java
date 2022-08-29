package com.company;

public class print_all_subsequences {
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str,0,"");

    }

    public static void subsequences(String str , int index , String newString){
        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char curr_char = str.charAt(index);

        //to  be
        subsequences(str,index + 1 , newString + curr_char);

        //not to be
        subsequences(str,index + 1 , newString);

    }
}
