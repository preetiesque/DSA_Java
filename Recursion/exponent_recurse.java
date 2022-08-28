package com.company;

public class exponent_recurse {
    public static void main(String[] args) {
        int x = 2 ;
        int n = 5;
        int ans = calc_power(2,5);
        System.out.println(ans);

    }
    public static int calc_power(int x , int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int xPownm1 = calc_power(x,n-1);
        int xPown = x * xPownm1;
        return xPown;

    }
}
