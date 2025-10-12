package collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExamples {
    public static void run() {
        System.out.println("\nSET EXAMPLES (HashSet vs TreeSet)");

        Set<String> names = new HashSet<>();
        names.add("Pedro");
        names.add("Lucas");
        names.add("Pedro"); // duplicado pra teste

        System.out.println("HashSet sem ordem: " + names);

        Set<String> orderedNames = new TreeSet<>(names);
        System.out.println("TreeSet ordenado: " + orderedNames);

    }
}
