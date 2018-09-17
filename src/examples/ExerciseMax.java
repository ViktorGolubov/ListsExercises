package examples;

import java.util.*;

/**
 * Given two numbers, display a message saying:
 * "the maximum is X" (whatever X is).
 */
public class ExerciseMax {

    public static void main(String[] args) {
        int price1 = 77;
        int price2 = 83;

        int max;

        if (price1 < price2) {
            max = price2;
        } else {
            max = price1;
        }

            System.out.println("the max " + max );

    }
}

