import java.util.*;

    /**
     * Loop exercises (while, for)
     */
    public class LoopExercises {

        public static void main(String[] args) {

            // NOTE:
            // If you want to make it a bit more difficult,
            // solve each exercise with a function that returns a value or a list of values.
            // Also add tests for them. See the following function:
            //performTests ();


            // 1. Write a loop that prints the numbers from 1 to 5

            int number = 1;

            while (number <= 5) {
                System.out.println("number is " + number);
                number++;

            }


            // 2. Write a loop that prints the numbers from `start` to `end`
            int start = 0;
            int end = 7;

            while (start <= end) {
                System.out.println("" + start);
                start++;

            }


            // 3. Write a loop that prints the even numbers from 1 to 10 (i.e. 2, 4, 6, 8, 10)

            int counter = 1;
            int counter1 = counter + counter;
            while (counter1 <= 10) {
                System.out.println("even numbers " + counter1);
                counter = counter + 1;
                counter1 = counter + counter;

            }


            // 4. Write a loop that prints the odd numbers from 1 to 10 (i.e. 1, 3, 5, 7, 9)

            int i = 1;
            int i1 = i;
            while (i1 < 10) {
                System.out.println(" odd numbers " + i1);
                i = i1 + 1;
                i1 = i + 1;

            }

            // 5. Write a loop that calculates the sum of the numbers from 1 to 10 (i.e. 1 + 2 + 3 + 4 + ... + 10 )

            int sum = 0;
            for (int i2 = 1; i2 <= 10; i2 = i2 + 1) {
                sum = sum + i2;
                System.out.println("sum = " + sum);

            }


            // 6. Write a loop that calculates the sum of the even numbers from 1 to 10 (i.e. 2 + 4 + ... + 10 )

            int sum1 = 0;
            for (int i3 = 1; i3 <= 10; i3 = i3 + 1) {
                i3++;
                sum1 = sum1 + i3;
                System.out.println("sum1 even = " + sum1);

            }


            // 7. Using a loop, calculate the power of 2^20 (i.e 2 * 2 * 2 * ... * 2, 20 times)

            System.out.println(" 2 to the 20 power " + Math.pow(2, 20));
            int sum3 = 2;
            for (int i4 = 2; i4 <= 20; i4 = i4 + 1) {
                sum3 = sum3 * 2;
                System.out.println("sum3 " + sum3);
            }


            // 8. Calculate the factorial of 10 (ie. 1 * 2 * 3 * 4 * ... * 10)
            //    https://en.wikipedia.org/wiki/Factorial

            int number1 = 10;
            for (int i5 = 9; i5 >= 1; i5 = i5 - 1) {
                number1 = number1 * i5;
            }
            System.out.println("number " + number1);



            // 9. Loop from 1 to 100 and print only the numbers that are multiple of 5.
            //    You can use the `remainder` operator: if n % 5 == 0 it means that n is multiple of 5.
            //    More difficult: don't use the `remainder` operator.


            // 10. Calculate the 10th fibonacci number
            //     The first fibonacci number is 0
            //     The second fibonacci number is 1
            //     From the third fibonacci number, it is calculated by adding the previous 2 numbers.
            //     So the third is 0+1=1, the fourth is 1+1=2, the fifth is 1+2=3, the sixth is 2+3=5, and so on.
            //     https://en.wikipedia.org/wiki/Fibonacci_number

        }   }