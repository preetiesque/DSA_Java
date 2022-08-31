package com.company;

public class paths_in_maze {
    public static void main(String[] args) {
        //assume n X m matrix
        int n = 4;
        int m = 4;
        int total = count_Paths(0,0,n,m);
        System.out.println(total);

    }

    public static int count_Paths(int i , int j , int n , int m){
        if (i == n || j == m){
            return 0;
        }
        if (i == n - 1 && j == m -1){
            return 1;
        }
        //move downwards
        int downPaths = count_Paths(i + 1 , j , n , m );

        //move right
        int rightPaths = count_Paths(i, j+1 , n , m );

        return downPaths + rightPaths;
    }
}
