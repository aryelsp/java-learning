import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        
        Predicate<Integer> ehPar = n -> n % 2 == 0;
        List<Integer> pares = numeros.stream()
                .filter(ehPar)
                .collect(Collectors.toList());
        System.out.println("Números pares: " + pares);

        
        Function<Integer, Integer> dobrar = n -> n * 2;
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());
        System.out.println("Números dobrados: " + numerosDobrados);

        
        Consumer<Integer> imprimir = n -> System.out.println("Número: " + n);
        numeros.forEach(imprimir);

        
        int soma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Soma: " + soma);

        
        Optional<Integer> opcional = numeros.stream()
                .filter(n -> n > 4)
                .findFirst();
        System.out.println("Primeiro número > 4: " + opcional.orElse(-1));
    }
}
