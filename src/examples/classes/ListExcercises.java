package examples.classes;

import java.util.*;
public class ListExcercises {


    /**
     *  List and loop exercises
     */
    public static class ListExercises {

        public static void main(String[] args) {

            // You can work with this list
            List<Integer> numbers = Arrays.asList( 4, 14, 2, 7, 3, 5, 7 );

            // If you want to make it a bit more difficult,
            // create a list by reading the values from the keyboard.


            // For the exercises, suppose that you
            // don't know the numbers in the list.
            // In other words, if you change the numbers
            // the exercises should still be right.
            // Look at the list only to check the answers.

            // Note: I'll say "position" or "index", meaning
            //       one of the available positions/places
            //       of the list (0, 1, 2, etc.)



            // 1 - Display the the 3rd element in the list (remember that indexes start at 0)
            int value = numbers.get(2); // Example of how to get the first element
            System.out.println("value = " + value);


            // 1 - Display the last index of the list (it's not exactly the size)

            int s = numbers.size();
            int value1 = numbers.get(s - 1);
            int i = 0;
       
            if (i < numbers.size()) {
                i += 1;
            }
            System.out.println("value1 = " + value1);


            // 3 - Calculate the sum of the first and the last element (just 2 numbers)
            s = numbers.size();
            int value2 = numbers.get(s - 1);
            int value3 = numbers.get(0);
            i = 0;
            int value4 = value2+ value3;

            if (i < numbers.size()) {
                i += 1;
            }
            System.out.println("value4 = " + value4 );

            // 4 - Display all the numbers (you need an index variable for the loop)

            for (i=0; i< numbers.size(); i++) {

                System.out.println(numbers.get(i));
            }

            // 5 - Display just the numbers at even positions: 14, 7, 5 ***
            s = numbers.size();
            int counter1 = i +1;
            int counter2 = counter1 + counter1;

            if (i < numbers.size()) {
                 counter1 = i +1;
                 counter2 = counter1 +1;
                 i = counter2 + i ;
            }
            System.out.println(numbers.get(i));

            // 6 - Calculate the sum of all numbers
            int sum = 0;
            i = 0;
            while (i < numbers.size()) {
                sum = sum + numbers.get(i);
                i++;
            }
            System.out.println("sum = " + sum);

            // 7 - Calculate the sum of the numbers at odd positions: 4, 2, 3, 7
            


            // 8 - Calculate the average of the numbers (total sum divided by number)
            sum = 0;
            i = 0;
            while (i < numbers.size()) {
                sum = sum + numbers.get(i);
                i++;

            } int finalSum = sum/numbers.size();
            System.out.println("finalSum = " + finalSum);

            // 9 - Find the maximum number (hint: you'll need an `if` too)

            int max = 0;
            if (numbers.get(i) > max){

                max = numbers.get(i);
                i++;

            } int total = max;

            System.out.println("total = " + total);


            // 10 - Find the minimum number


            // More difficult:


            // 11 - Display the number at the index indicated by the number at index 4


            // 12 - Display the numbers whose index is the same as the number itself


            // 13 - Swap the number at position 0 with the last number of the list.
            //      When I say "swap" I mean you have to change the positions of those
            //      numbers: move each one of them to the position of the other.
            numbers.set(5, value); // Example of how to set a value at index 5 of the list


            // 14 - Swap the number at index 0 with the smallest value in the list


            // 15 - Given some start index swap the number at that index with the smallest
            //      number from that index. For example, if `start` is 3, find the smallest
            //      number from that index, ignoring lower indexes like 0, 1, 2.
            //      Just look from index 3 and above. Then swap the numbers.
            int start = 3;


            // OK, you reached here! Even MORE difficult:


            // 16 - Find the repeated numbers (hint: you'll need a loop inside another)


            // 17 - Sort the list using the "selection sort algorithm":
            //      Start at index 0 and do what you did in exercise 15.
            //      Then move to index 1 and do the same.
            //      Then move to index 2 and do the same.
            //      When you get to the end of the list (to the last index) you're done!
            //      So, in other words, what you have to do is to repeat the process you
            //      did in ex 15 for every index in the list.
        }
    }
}
