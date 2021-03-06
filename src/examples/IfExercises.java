package examples;

public class IfExercises {

        public static void main(String[] args) {


            // 1. Define a `price` variable and set some value.
            //    Then print "it's expensive" if the `price` is greater than 1000.
            int price = 1005;
            if (price > 1000) {
                System.out.println("It is expensive " + price);
            }


            // 2. Now print "expensive" if it's greater than 1000, and print "cheap" otherwise (use `else`).

            if (price > 1000) {
                System.out.println("It is expensive " + price);
            } else {
                System.out.println("cheap" + price);
            }


            // 3. Define an `age` variable and set some value. Then just define a `cinemaPrice` variable.
            //    If the person is adult (18 years or more), the price of cinema should be 10, otherwise it should be 5

            int age = 27;
            double cinemaPrice = 15;
            if (age <= 18) {
                cinemaPrice = cinemaPrice - 10;
            } else {
                cinemaPrice = cinemaPrice - 5;
            }


            // 4. Now let's say that adults pay 10, teenagers pay 7 and kids pay 5.
            //    Use if / else if / else to set the right price for each age.
            if (age >= 18) {
                cinemaPrice = cinemaPrice - 5;
            } else if (13 <= age) {
                cinemaPrice = cinemaPrice - 8;
            } else {
                cinemaPrice = cinemaPrice - 10;
            }


            // -- Nested statements --
            // Notice that inside an `if` you can put any statements, even another (nested) `if`.
            // Let's see an example.

            int somePrice = 100;

            if (somePrice > 10) {

                // price is not small, let's see if it's very big or not

                // This is a nested "if" (it's inside another "if")
                if (somePrice > 1000) {
                    // price is big
                } else {
                    // price is normal
                }

            } else {
                // price is small
            }


            // 5. Knowing that, let's say you have some `price` and `age` variables, with some values.
            //    If the person is adult, you want to check the price and, if it's huge (more than 1000), you
            //    want to apply a discount (only if person is adult).
            //    On the other side, if the person is not an adult, you check if the price is small (less than 10) and
            //    in that case you just give the product for free (set price to 0).
            int discount = 55;
            if (age >= 18) {
                if (price > 1000) {
                    price = price - discount;
                }
            } else {
                if (price < 10) {
                    price = 0;
                }
            }


            // -- Check multiple conditions at the same time ---
            // You can check two conditions by joining them with this operator: `&&`
            // That operator is called "AND" (as in "one thing AND another thing")

            // So let's say you want to check if price is big:
            boolean isBigPrice = price > 1000;
            // Also if person is adult:
            boolean isAdult = age >= 18;

            // Now I want to offer a discount for clients that are adult AND pay a big price.
            // So I check both conditions:
            if (isAdult && isBigPrice) {      // if is adult AND is big price ...
                somePrice = somePrice - 100;
            }


            // 6. Knowing that, try the exercise 5 using the `&&` operator
            boolean isAge = age >= 18;
            boolean isPrice = price > 1000;


            if (isAge && isPrice) {
                price = price - discount;
            } else if (age < 18 && price < 10) {
                price = 0;

            }


            // 7. Let's say you have to calculate if a workout exercise is difficult or not
            //    You know if the person `isMale`, you know the `repetitions` of the exercise and the `weight` to lift.
            //    For men, an exercise is difficult if it has more than 10 repetitions and weight is more than 30 kg.
            //    For women, it's difficult if it has more than 15 repetitions and weight is more than 20 kg.
            //    How could you display if an exercise is difficult given the 3 variables?
            //    Try to do the exercise by assigning the result to a `isDifficult` variable and then printing the message
            //    "it's difficult" or "it's easy" depending on that variable.

            /*
            int weight = 25;
            int repetitions = 8;
            boolean isMale = true;
            String = "it's difficult";
            String = Integer.parseInt("it's easy");

            if (boolean isMale >int weight &&int repetitions  ){
                System.out.println("isDifficult" +);
                else() {
                    System.out.println("It");
                }

            }
            */

            // -- Logical operators --
            // Besides the AND operator `&&`, there is also the OR operator `||` and the NOT operator `!`.
            // The NOT `!` operator is placed just to the left of the value that we want to "negate".

            // For example, I want to play football if it's warm OR if it doesn't rain. So the condition is:
            boolean isRaining = false;
            boolean isWarm = true;
            if (isWarm || !isRaining) {
                System.out.println("I play football");
            }


            // 8. Remember the condition `if (isAdult && isBigPrice)` of the example above.
            //    Now let's say you want apply the discount if the person is NOT an adult OR the price is big.
            //    Write that `if` statement again, now with the new condition.

            if (isAdult || !isBigPrice) {
                System.out.println("Discount");


                // 9. This is the most difficult: can you think of an exercise where you need conditions?
                //    Think of some subject you like (sports, cinema, biology, books, economics, etc.) and try
                //    to "solve a problem" like the ones in the previous examples. Describe the situation and
                //    try to code the solution.
                // There is 3 books. I want to buy them all, but at a max discount. Discount 10 if it costs more than 100,
                // discount 5 if it costs more than 50 and give it as a present if it is cheaper or equal than 10.
                int book = 10;
                int book1 = 51;
                int book2 = 115;

                /*
                if (book || book1 || book2 > 100 ) {
                    discount =
                }
                */


            }
        }
    }