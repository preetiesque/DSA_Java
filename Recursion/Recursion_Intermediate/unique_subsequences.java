package com.company;

import java.util.HashSet;

public class unique_subsequences {
    public static void main(String[] args) {
        //hash set to implement this problem
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        unique_subsequences(str,0,"",set);
    }

    public static void unique_subsequences(String str , int index , String newString ,HashSet<String> set){
        if (index == str.length()){
            if (set.contains(newString)){
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr_char = str.charAt(index);

        //to  be
        unique_subsequences(str,index + 1 , newString + curr_char , set);

        //not to be
        unique_subsequences(str,index + 1 , newString , set);

    }
}
