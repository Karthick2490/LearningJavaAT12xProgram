package Exercise11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class lab114_WhileLoopGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        while(numberToGuess<0 || numberToGuess >100)
        {
            System.out.println(("Enter a valid number between 1 to 100"));
        }

        while(true)
        {
            System.out.println("Guess a number");
            while(!scanner.hasNextInt())
            {
                System.out.println("Enter a valid number");
                scanner.next();
            }
            int guess = scanner.nextInt();
            attempt++;
            if(guess < numberToGuess)
            {
                System.out.println("Too Low");
            }
            else if(guess > numberToGuess)
            {
                System.out.println("Too High");
            }
            else
            {
                System.out.println("Correct ! Your Guess number is " +guess);
                break;
            }
            attempt++;
        }
    }
}
