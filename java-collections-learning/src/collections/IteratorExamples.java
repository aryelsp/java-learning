package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {
    public static void run() {
        System.out.println("\nITERATOR EXAMPLE");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();

        System.out.print("Fruits: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("Foreach:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);

        }
    }
}
