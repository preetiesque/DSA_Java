package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Preeti");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'K');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,'a');
        System.out.println(sb);

        sb.delete(4,5);
        System.out.println(sb);

        sb.append('a');
        System.out.println(sb);

        System.out.println(sb.length());

    }
}
