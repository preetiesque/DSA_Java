package com.company;

public class Tower_Of_Hanoi {

    public static void main(String[] args) {
        //Tower of Hanoi
        //understand the approach carefully
        int n = 3;
        tower_of_Hanoi(n,"S" , "H" , "D");

    }

    public static void tower_of_Hanoi(int n , String src , String helper , String dest){
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;

        }

        tower_of_Hanoi(n-1, src , dest , helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        tower_of_Hanoi(n-1 , helper , src , dest);

    }
}
