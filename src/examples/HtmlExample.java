package examples;

import java.io.PrintWriter;

public class HtmlExample {

    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter ( "example.html");

        String movie1 = "Memento";
        String movie2 = "Pulp Fiction";
        String movie3 = "Her";


        writer.println("<h1>Movies</h1>");
        writer.println("<h3>Recommended movies</h3>");
        writer.println("<p>Here you will see the movies</p>");
        writer.println("<ul>");
        writer.println("<li>" + movie1 + "</li>");
        writer.println("<li>" + movie2 + "</li>");
        writer.println("<li>" + movie3 + "</li>");
        writer.println("</u>");


        writer.close();

        System.out.println("HTML file written");

    }

}
