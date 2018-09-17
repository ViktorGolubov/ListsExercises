package examples.classes.calculator;

public class Calculator {

    double value;

    public Calculator ( double value ) {

        this.value = value;


    }

    public void add ( double amount){
        this.value = value + amount;

    }
    public void power (double exponent) {

        double result = 1;

        int counter = 1;
        while ( counter <= exponent ) {
            System.out.println("counter: " + counter);
            result = result * this.value;
            counter++;
        }
        this.value = result;

    }

}
