package com.company;

public class clear_BIT {
    public static void main(String[] args) {
        int n = 5 ; //0101
        int pos = 2;
        int bitmask = 1 << pos;
        int notbitmask = ~(bitmask);

        int ans = n & notbitmask;
        System.out.println(ans);
    }
}
