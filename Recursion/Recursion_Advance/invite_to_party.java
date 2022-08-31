package com.company;

public class invite_to_party {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(ways_to_invite(n));

    }

    public static int ways_to_invite(int n){
        if (n <= 1){
            return 1;
        }
        //inviting guests as a single person
        int ways1 = ways_to_invite(n-1);

        //pair
        int ways2 = (n-1)  * ways_to_invite(n-2) ;

        return ways1 + ways2;

    }
}
