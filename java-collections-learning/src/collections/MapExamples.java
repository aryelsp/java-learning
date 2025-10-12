package collections;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExamples {
    public static void run() {
        System.out.println("\nMAP EXAMPLES (HashMap vs TreeMap)");

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Pedro");
        students.put(2, "Maria");
        students.put(3, "Lucas");

        System.out.println("HashMap sem ordem: " + students);

        Map<Integer, String> sortedStudents = new TreeMap<>(students);
        System.out.println("TreeMap ordenado: " + sortedStudents);

    }
}
