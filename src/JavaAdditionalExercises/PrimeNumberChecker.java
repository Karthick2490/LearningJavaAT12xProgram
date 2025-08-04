package JavaAdditionalExercises;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Enter a number to check whether it is prime or not");
        if(scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }
        boolean isPrime = true;
        if(input <= 1)
        {
            isPrime = false;
            System.out.println("Not a Prime Number");
        }

        if(input == 2)
        {
            isPrime = true;
            System.out.println("Prime number");
        }

        if(input % 2 == 0)
        {
            isPrime = false;
        }
        else
        {
            for(int i = 3; i <= Math.sqrt(input); i++)
            {
                if(input % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("Entered number is a prime number");
        }
        else {
            System.out.println("Its not a prime number");
        }
    }
}
