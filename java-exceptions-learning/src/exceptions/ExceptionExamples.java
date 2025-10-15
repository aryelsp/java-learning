package exceptions;

import java.util.Scanner;

public class ExceptionExamples {

    // method that throws a checked exception
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Idade menor que 18!");
        } else {
            System.out.println("Idade válida: " + age);
        }
    }

    // method that throws a unchecked exception runtimeexception
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        System.out.println("Resultado: " + (a / b));
    }

    public static void tryCatchFinallyExample() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        try {
            System.out.println("Você digitou: " + number);
            divide(number, 0); // causes exception
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado sempre.");
        }

        sc.close();
    }
}
