package com.company;

public class first_last_occurrence {
    public static void main(String[] args) {
        String str = "aabcdabaad";
        find_occurrence(str,0 , 'a');

    }

    public static int first = -1;
    public static int last = -1;

        public static void find_occurrence(String str , int index , char element){

            if (index == str.length()){
                System.out.println(first);
                System.out.println(last);
                return;
            }
            char curr_char = str.charAt(index);
            if (curr_char == element){
                if (first == -1){
                    first = index;
                } else {
                    last = index;
                }
            }
            find_occurrence(str,index+1 , element);
        }

    }


