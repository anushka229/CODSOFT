import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lower = 1;
        int upper = 100;
        int max_attempts = 10;
        int score = 0;

        System.out.println("Number Guessing Game");

        do {
            int generated_number = random.nextInt(upper - lower + 1) + lower;
            int attempts = 0;
            boolean guessed_correctly = false;

            System.out.println("\nI have generated a number between " + lower + " and " + upper);

            while (attempts < max_attempts) {
                System.out.print("Enter your guess: ");
                int user_guess = scanner.nextInt();
                attempts++;

                if (user_guess == generated_number) {
                    System.out.println("You have guessed the correct number in " + attempts + " attempts.");
                    guessed_correctly = true;
                    break;
                } else if (user_guess < generated_number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }

            if (!guessed_correctly) {
                System.out.println("You have reached the maximum number of attempts. The correct number was: " + generated_number);
            } else {
                score++;
            }

            System.out.print("Do you want to play again? (Yes/No): ");
        } while (scanner.next().equalsIgnoreCase("Yes"));

        System.out.println("Your final score is: " + score);
        scanner.close();
    }
}
