package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;



public class highest_altitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of points visited : "); //points visited will be n
        int points = in.nextInt();
        int[] gain = new int[points-1];
        System.out.println("Enter the gain for each point visited : ");
        for (int i = 0 ; i < points - 1 ; i ++){
            gain[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(gain));
        int result = (largestAltitude(gain));
        System.out.println(result);

    }
    static int largestAltitude(int[] gain){
        int n = gain.length + 1;
        int[] heights = new int[n];
        heights[0] = 0;
        for (int i = 1 ; i < n ; i ++){
            heights[i] = heights[i-1] + gain[i-1];
        }

        int max = 0 ;
        for (int j = 0 ; j < heights.length ; j ++){
            if (heights[j] > max){
                max = heights[j];
            }
        }
        return max;
    }
}
