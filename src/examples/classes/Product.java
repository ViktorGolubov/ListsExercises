package examples.classes;

public class Product {


    double price;
    boolean availiable;
    String color;
    String name;


    // Constructor
    public Product (String name, double price, String color ) {

        this.price = price;
        this.name = name;
        this.color = color;
        this.availiable = true;

    }
    public void printProductDetails () {

        System.out.println(this.name + " costs " + this.price + " and is  "
                + this.color + " availiable: " + this.availiable);
    }
    public void printName () {

        System.out.println(this.name );
    }

    public void printAvailiability() {

        if (this.availiable == true){
            System.out.println("It is availiable: " );
        } else {
            System.out.println(" It is not availiable " );
        }
    }

    public void printExprnsive() {


        if(this.price < 1000) {
            System.out.println( "It is not expensive " );

        } else {
            System.out.println( "It is expensive ");

        }


    }
    public void printAffordable( double budget) {


        if (this.price < budget){
            System.out.println( " You can buy " + this.name);
        } else {
            System.out.println( " You can't buy " +this.name);
        }

    }

    public void applyDiscount ( double discount) {

        this.price -= discount;

        }
    }

