package com.company;

public class move_all_X_to_end {
    public static void main(String[] args) {
        String str = "axbxcxxd";
        moveAllX(str,0,0,"");

    }
    public static void moveAllX(String str , int index , int count , String newString){
        if (index == str.length()){
            for (int i = 0 ; i < count ; i ++){
                newString += 'x' ;
            }
            System.out.println(newString);
            return;
        }
        char curr_char = str.charAt(index);
        if (curr_char == 'x'){
            count++;
            moveAllX(str , index + 1 , count ,newString);
        } else {
            newString += curr_char;
            moveAllX(str , index + 1 , count , newString);
        }

    }
}
