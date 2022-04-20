package com.company;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

        //Print numbers from 1 to 5
        /*for (int i = 1; i<6;i++){
            System.out.println(i);
        }*/
                //print numbers from 1 to n,taking user input n
                System.out.println("Enter value of n");
                Scanner num = new Scanner(System.in);
                int n = num.nextInt();

                for (int i=1; i <= n ; i +=1) {
                    //System.out.println(i);
                    System.out.println("Hello World!");
                }
            }
        }



