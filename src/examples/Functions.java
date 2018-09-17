package examples;

import java.util.*;

import static java.lang.Integer.max;

public class Functions {
    public static void mail(String[] args) {

        sayHello("Mary"); //function/method call
        sayHello("Peter");

        int maximum = sum(7, 9);

        System.out.println("The sum is " + maximum);
    }

    public static void sayHello (String name) {

        System.out.println("hello " + name);
    }

    public static int sum (int a, int b){
       int result = a + b;
       return result;
    }


    public static int max (int a, int b) {

        int result = a;


        if (a < b) {
            result = b;
        }
        return result;
    }









}
