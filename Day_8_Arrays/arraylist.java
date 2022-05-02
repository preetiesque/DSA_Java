package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>(10);

        /*list.add(9);
        list.add(89);
        list.add(8);
        list.add(189);
        list.add(891);
        list.add(879);
        list.add(9);
        list.add(89);
        list.add(8);
        list.add(189);
        list.add(891);
        list.add(879);
        list.add(9);
        list.add(89);
        list.add(8);
        list.add(189);
        list.add(891);
        list.add(879);
        list.add(9);
        list.add(89);
        list.add(8);
        list.add(189);
        list.add(891);
        list.add(879);
        list.add(9);
        list.add(89);
        list.add(8);
        list.add(189);
        list.add(891);
        list.add(879);

        System.out.println(list.contains(891)); //returns true if present in list and vice versa

        list.set(0,99); //to update the values accordingly as per the given index

        list.remove(3); //remove element from a particular index as well
*/
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item from the list at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + "  "); //we cannot get items from list individually or separately
        }  //pass index here; list[index] syntax won't work here

        //System.out.println(list);  //we can directly print list because toString is called internally by list
    }
}
