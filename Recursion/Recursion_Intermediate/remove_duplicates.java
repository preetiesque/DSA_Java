package com.company;

public class remove_duplicates {
    public static void main(String[] args) {
        //map array
        String str = "abbcddbce";
        remove_duplicates(str,0,"");
    }
    public static boolean[] map = new boolean[26];
     public static void remove_duplicates(String str , int index , String newString){
         if (index == str.length()){
             System.out.println(newString);
             return;
         }
         char curr_char =  str.charAt(index);
         if (map[curr_char - 'a'] == true){
             remove_duplicates(str,index + 1, newString);
         } else {
             newString += curr_char;
             map[curr_char - 'a'] = true;
             remove_duplicates(str,index + 1 , newString);
         }
     }

}
