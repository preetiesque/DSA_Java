package com.company; //doubtful

public class Search_in_Strings {
    public static void main(String[] args) {
        String name = "Preeti";
        char target = 'e';
        System.out.println(search(name,target));

    }
    //creating a different function
    static boolean search(String str,char target){
        if (str.length() == 0) { //has brackets because this is a function
            return false;
        }

        for (int index = 0; index < str.length() ; index++) {
            if (target == str.charAt(index));
            return true;
        }
        return false;
    }
}
