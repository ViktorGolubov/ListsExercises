public class Exersice12 {

    public static void main(String[] args) {

       int total5 = sumUpTo(5);

        System.out.println("The result is = " + total5);

        int finalFactorial = factorial(5);
        System.out.println("finalFactorial = " + finalFactorial);



    }

    public static int  factorial ( int number )  {
        int counter = 1;
        int result = 1;
        while ( counter <= number) {
            result = result * counter;
            counter++;

        }
       return result;

    }


    public static int difference (int a, int b){

        int result;

        if ( a > b ) {
            result = a - b;

        } else {
            result = b - a;

        }

        return result;
    }




        public static int sumUpTo (int number) {

            int result = 0;
            int counter = 1;

            while ( counter <= number){

                result = counter + result;
                counter ++;

            }

            return result;

        }

    }
