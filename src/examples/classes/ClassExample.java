package examples.classes;

public class ClassExample {

    public static void main(String [] args) {


        Product tv = new Product("Samsung TV",500, "black");

        Product house = new Product("Country House", 1500, "white");

        Product car = new Product( "BMW", 20000, "sedan");

        Product house2 = new Product(house.name, house.price, house.color);

        house2.price = 1000;

        house.printProductDetails();
        tv.printProductDetails();
        car.printProductDetails();

        house.printName();
        tv.printName();
        car.printName();

        house.printAvailiability();
        tv.printAvailiability();
        car.printAvailiability();

        house.printExprnsive();
        tv.printExprnsive();
        car.printExprnsive();


        System.out.println("-----");
        tv.printAffordable(450);
        tv.applyDiscount(100);
        tv.printAffordable(450);
        System.out.println("-----");


        house.printAffordable(6000);
        tv.printAffordable(50);
        car.printAffordable(1500);

        house.applyDiscount(50);
        tv.applyDiscount(50);
        car.applyDiscount(50);

        house.printAffordable(60000);
        tv.printAffordable(50);
        car.printAffordable(15000);


        /*
        System.out.println(car.name + " costs " + car.price + " availiable: " + tv.availiable );
        System.out.println( tv.name + " costs " + tv.price + " and is  " + tv.color + " availiable: " + tv.availiable);
        */
    }


    }


