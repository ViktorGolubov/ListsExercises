package examples;

import java.util.*;

public class  ListExampels {

    public static void main(String[] args) {

        List<String> names;
        names = new ArrayList<String>();

        names.add ("John");
        names.add ("Daria");
        names.add ("Ben");

        int s = names.size();
        System.out.println("size = " + s);



        int counter = 0;
        while (counter < names.size()) {
            String name = names.get(counter);
            if (name.length() < 5) {
                System.out.println(" name " + name);

            }

            counter ++;

        }

    }

}
