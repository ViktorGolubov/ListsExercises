public class ExampleFunctions {

    public static void main(String[] args) {
        double finalPrice1 = calculateFinalPrice (1000);
        double finalPrice2 = calculateFinalPrice (990);


        double maxPrice = maximum (finalPrice1, finalPrice2);

        System.out.println("Final price: " + finalPrice1);
        System.out.println("Final price: " + finalPrice2);
        System.out.println("Maximum price: " + maxPrice);

        }

    public static double maximum(double a, double b) {

        double result;

        if (a>b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    public static double calculateFinalPrice(double price) {

        double discount;

        if ( price >= 1000 ) {
            discount = 0.20;
        } else if (price > 100) {
            discount = 0.15;
        } else {
            discount = 0.05;
        }

        double finalPrice = price * (1 - discount);

        return finalPrice;
    }

}
