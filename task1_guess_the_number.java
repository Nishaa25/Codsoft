import java.util.Scanner;
import java.util.Random;

public class task1_guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        boolean playAgain = true;

        while (playAgain) {

            int computerInput = r.nextInt(100);

            int k = 10;

            boolean correct = false;

            System.out.println("WELCOME TO NUMBER GUESSING GAME....!🔢\n I'm thinking of a number " +
                    "between 0 and 100.\n You have 10 tries to guess the number.🔟");

            while (k > 0) {
                System.out.println("Enter your guess: ");
                int userGuess = sc.nextInt();


                if (userGuess == computerInput) {
                    System.out.println("You guessed the number!\nYou won!🥳");
                    correct = true;
                    break;
                }
                else if (userGuess > computerInput) {
                    System.out.println("Your guess is too high.⬆️\nYou have " + (k - 1) + " tries left.");
                }
                else {
                    System.out.println("Your guess is too low.⬇️\nYou have " + (k - 1) + " tries left.");
                }
                k--;
            }

            if (!correct) {
                System.out.println("You ran out of tries.😣\nYou lose!");
                System.out.println("The correct number was: " + computerInput);
            }

            System.out.println("Do you want to play again? (yes/no)");
            String response = sc.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        sc.close();
        System.out.println("Thanks for playing the game..!😊");
    }
}


