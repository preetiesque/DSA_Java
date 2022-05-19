package com.company;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you number : ");
        int num = in.nextInt();

        System.out.println(isPalindrome(num));

    }

    static boolean isPalindrome(int num){
        int temp = num;
        int ans = 0;
        while (num > 0){
            ans = (ans * 10) + num % 10;
            num = num / 10;
        }
        if ( ans == temp){
            return true;
        } else {
            return false;
        }

    }

}
