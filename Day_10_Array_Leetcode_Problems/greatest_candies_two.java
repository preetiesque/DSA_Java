package com.company;
import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class greatest_candies_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of kids : ");
        int n = in.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the number of candies each kid has : ");
        for(int i = 0 ; i < candies.length ; i ++){
            candies[i] = in.nextInt();
        }
        System.out.println("Enter the number of extra candies : ");
        int extra = in.nextInt();

        System.out.println(Arrays.toString(candies));
        System.out.println(extra);
        System.out.println(kidsWithCandies(candies,extra));

    }
    static List<Boolean> kidsWithCandies(int[] arr,int extraCandies){
        List <Boolean> candiesList = new ArrayList<>();
        int max = -1;
        for (int i = 0 ; i < arr.length ; i ++){
            max = Math.max(max,arr[i]);
        }
        for (int i = 0 ; i < arr.length ; i ++){
            candiesList.add(arr[i] + extraCandies >= max);
        }
        return candiesList;
    }
}
