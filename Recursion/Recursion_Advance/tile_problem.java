package com.company;

public class tile_problem {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int ways = tile_fill_ways(n,m);
        System.out.println(ways);

    }
    public static int tile_fill_ways(int n , int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        //vertically
        int vertical_placements = tile_fill_ways(n-m,m);

        //horizontally
        int horizontal_placements = tile_fill_ways(n-1,m);

        return vertical_placements + horizontal_placements;
    }
}
