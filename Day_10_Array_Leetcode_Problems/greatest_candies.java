package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class greatest_candies {
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

    static List<Boolean> kidsWithCandies(int[] arr,int extraCandies) {
        ArrayList<Boolean> candyList = new ArrayList<Boolean>(arr.length);
        int maxCandies = 0;
        for (int candy = 0 ; candy < arr.length ; candy ++){
            if (arr[candy] > maxCandies);
            maxCandies = arr[candy];
        }

        for (int candy = 0 ; candy < arr.length ; candy ++){
            candyList.add(candy+ extraCandies >= maxCandies); //Boolean statement
        }
        return candyList;
    }
}
