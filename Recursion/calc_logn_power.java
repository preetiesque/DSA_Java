package com.company;

public class calc_logn_power {
    public static void main(String[] args) {
        //stack height log n
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

        //if n is even
        if (n % 2 == 0){
           return calc_power(x,n/2) * calc_power(x , n /2);
        } else { //if n is odd
            return  x * calc_power(x,n/2) * calc_power(x , n /2);
        }

    }
}
