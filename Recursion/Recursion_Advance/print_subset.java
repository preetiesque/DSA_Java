package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class print_subset {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n,subset);
    }

    public static void subsets (int n , ArrayList<Integer> subset){
        if (n==0){
            printSubset(subset);//to create new function to print arraylist type subset
            return;
        }
        //2 choices for each element

        //whether it gets added in subset
        subset.add(n);
        subsets(n-1,subset);

        //whether it does not get added in subset
        subset.remove(subset.size()-1);
        subsets(n-1,subset);


    }
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0 ; i < subset.size() ; i ++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
}
