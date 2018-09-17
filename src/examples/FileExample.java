package examples;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileExample {

    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter ( "example.txt");


        writer.print("It is there!");
        writer.println("hello there!");
        writer.println("hello there!");
        writer.println("hello there!");

        writer.close();

        System.out.println("File written");

    }

}
