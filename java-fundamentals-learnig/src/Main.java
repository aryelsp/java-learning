import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int amount = input.nextInt();

        int[] numbers = new int[amount];
        int sum = 0;
        int even = 0;
        int odd = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum += numbers[i];
            if (numbers[i] % 2 == 0) even++;
            else odd++;

            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        //processing
        double average = sum / (double) amount;

        //output
        System.out.println("\n===== RESULTS =====");
        System.out.println("Numbers entered:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\nHighest number: " + max);
        System.out.println("Lowest number: " + min);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        //testing strings and ternary operator
        System.out.print("\nDo you want to see the reversed list (yes/no)? ");
        input.nextLine(); //clear buffer
        String answer = input.nextLine();

        System.out.println(answer.equalsIgnoreCase("yes")
                ? "\nReversed list:" : "\nOk, exiting...");

        if (answer.equalsIgnoreCase("yes")) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }

        input.close();
    }
}
