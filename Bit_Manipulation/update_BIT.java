package com.company;
import java.util.Scanner;

public class update_BIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation : ");
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        //int op = 1; //update bit to 1 else update bit to 0
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        if (oper == 1){
            //set operation
            int newnum = bitmask | n;
            System.out.println(newnum);
        } else {
            //clear operation
            int newnum = notbitmask & n;
            System.out.println(newnum);
        }

    }
}
