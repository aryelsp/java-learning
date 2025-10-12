package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {
    public static void run() {
        System.out.println("\nLIST EXAMPLES (ArrayList vs LinkedList)");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Pedro");
        arrayList.add("Lucas");
        arrayList.add("Maria");

        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.addFirst("João");
        System.out.println("LinkedList: " + linkedList);

    }
}
