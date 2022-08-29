package com.company;

public class factorial {
    public static void main(String[] args) {
        int n = 5 ;
        int ans = fact_recurse(n);
        System.out.println(ans);

    }

    public static int fact_recurse(int n){
        if (n == 1 || n == 0){
            return 1;
        }


        int factorial_nm1 = fact_recurse(n-1);
        return n * factorial_nm1;
    }

}
