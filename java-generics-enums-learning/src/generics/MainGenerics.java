package generics;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {
    public static void run() {
        System.out.println("# GENERICS EXAMPLES");

        // box com string
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);

        // box com int
        Box<Integer> intBox = new Box<>(123);
        System.out.println(intBox);

        // List<String> vs List<Object>
        List<String> stringList = new ArrayList<>();
        stringList.add("Pedro");
        // stringList.add(123); // daria um erro por nao aceitar inteiro, int

        List<Object> objectList = new ArrayList<>();
        objectList.add("Maria");
        objectList.add(456); // Aceita qualquer tipo

        System.out.println("List<String>: " + stringList);
        System.out.println("List<Object>: " + objectList);
    }
}
