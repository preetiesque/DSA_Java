package com.company;

import java.util.Scanner;

public class reverse_int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse : ");
        int num = in.nextInt();
        System.out.println(reverse(num));
    }

    static int reverse(int num){
        int ans = 0;
        if (num > 0){
            while (num > 0){
                ans = ans * 10 + num % 10 ;
                num = num / 10;
            }
            if ( ans < Math.pow(2,31) - 1){
                return ans;
            } else {
                return 0;
            }

        } else {
            while (num != 0){
                ans = ans * 10 + num % 10;
                num = num / 10;
            }
            if (ans > -(Math.pow(2,31) -1)){
                return ans;
            } else {
                return 0;
            }

        }


    }
}
