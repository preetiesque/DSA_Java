package com.company;

import java.util.Scanner;

public class discount_product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product amount : ");
        float amt = in.nextInt();
        System.out.println("Enter the discount percent : ");
        float disc_per = in.nextInt();

        float discount = (disc_per / 100 ) * amt;
        float price = amt - discount;

        System.out.println("The final price is " + price); //the type of variable is really important here whether it is float or int
    }
}
