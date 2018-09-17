package examples;

import java.util.*;
public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price = 20;

        System.out.println("Give me the quantity");

        int quantity;
        quantity = Integer.parseInt( input.nextLine());

        double total = price * quantity;

        System.out.println("Price is " + price);
        System.out.println("Total is " + total);

    }



    }
