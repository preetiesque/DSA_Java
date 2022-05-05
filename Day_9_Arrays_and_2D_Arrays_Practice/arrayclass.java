package com.company;

import java.util.Arrays;
import java.util.ArrayList;

public class arrayclass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(23);
        list.add(3);
        list.add(231);
        list.add(233);
        list.add(234);
        list.add(232);
        list.add(234);
        list.add(236);

        System.out.println(list.get(5));
    }
}
