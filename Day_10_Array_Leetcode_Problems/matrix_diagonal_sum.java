package com.company;
import java.util.Scanner;

public class matrix_diagonal_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println("Enter the elements of the matrix : ");

        //input
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr[i].length ; j ++){
                arr[i][j] = in.nextInt();
            }
        }

        //output
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr[i].length ; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(matrix_diagonal_sum(arr));

    }
    static int matrix_diagonal_sum(int[][] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            sum = sum + arr[i][i];
            sum = sum + arr[i][(arr.length - 1) - i];
        }

        if (arr.length % 2 != 0){
            sum = sum - arr[arr.length /2][arr.length / 2];
        }
        return sum;
    }
}
