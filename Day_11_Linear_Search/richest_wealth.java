package com.company;
import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/

public class richest_wealth {
    public static void main(String[] args) {
      /* [[1,2,3],
        [4,5,6],
        [7,8,9]] */
    }

    static int max_wealth(int[][] accounts){
        // int person = row
        // int wealth = col
        int ans = 0;
        for (int person = 0 ; person < accounts.length ; person ++) {
            // when we start a new row take sum of the previous row
            int sum = 0;
            for (int wealth = 0 ; wealth < accounts[person].length ; wealth ++) {
                sum = sum + accounts[person][wealth];
            }
            //now we have the sum of accounts of a person
            //check with overall ans
            if (sum > ans) {
                ans = sum ;
            }
        }
        return ans;
    }
}
