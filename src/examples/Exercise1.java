package examples;

import java.util.*;
//shortcut: psvm

/**
 * Declare 3 variables for prices, and assign values.
 * Declare another variable and put the total sum of the prices.
 * In another variable, assign a value for some discount )e.g. 15)
 * If the total amount of the prices is of the prices is 100 or greater, apply the discount to the total amount.
 * Print the total amount.
 */
public class Exercise1 {

    public static void main(String[] args) {

        int price1 = 30;
        int price2 = 50;
        int price3 = 70;

        double total = price1 + price2 + price3 ;
        System.out.println(" total is" + total);

        double average = total / 3;
        System.out.println("Average " + average);

        double discount = 0.15;
        if (total >= 100) {
            total = total * (1 - discount);

            System.out.println(" the total " + total);
        }


        }



    }


