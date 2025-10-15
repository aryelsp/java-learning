package exceptions;

public class MainExceptions {

    public static void run() {
        System.out.println("TRY, CATCH, FINALLY EXAMPLE");
        ExceptionExamples.tryCatchFinallyExample();

        System.out.println("\nTHROW E THROWS EXAMPLE");
        try {
            ExceptionExamples.checkAge(15);
        } catch (CustomException e) {
            System.out.println("Exceção checada capturada: " + e.getMessage());
        }

        System.out.println("\nEXCEÇÕES NÃO CHECADAS (RuntimeException)");
        try {
            ExceptionExamples.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exceção não checada capturada: " + e.getMessage());
        }
    }
}
