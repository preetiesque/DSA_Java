package com.company;

public class Get_BIT {

    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos; //left shift

        if ((bitMask & n) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }
}
