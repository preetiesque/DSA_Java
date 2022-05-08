package com.company;



public class flipping_an_image {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for (int row = 0; row < arr.length ; row++) {
            //for each column in the row
            for ( int col = 0; col < arr[row].length ; col++) { //importance of indexing
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("*****");

        int[][] arr1 = array_img(arr);
        for (int row = 0; row < arr1.length ; row++) {
            //for each column in the row
            for ( int col = 0; col < arr1[row].length ; col++) { //importance of indexing
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

    }

    static int[][] array_img(int[][] arr){
        int[][] arr1 = new int[arr.length][arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = 0 ; j < arr[i].length ; j ++){
                arr1[i][j] = arr[i][(arr[i].length - 1) - j];
            }
        }
        int[][] arr2 = new int[arr.length][arr.length];
        for (int a = 0 ; a < arr.length ; a ++){
            for (int b = 0 ; b < arr.length ; b ++){
                if (arr1[a][b] == 1){
                    arr2[a][b] = 0;
                } else {
                    arr2[a][b] = 1;
                }
            }
        }
        return arr2;
    }
}
