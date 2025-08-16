package Tasks.June20Tasks;

import java.util.Scanner;

public class CheckidPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true)
        {
            System.out.println("Enter the number to check whether it is prime or not: ");

            if(scanner.hasNextInt())
            {
                number = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
        }
        boolean isPrime = true;

        if(number <=1)
        {
            isPrime = false;
        }
        else {
            for (int i = 2; i < Math.sqrt(number) ; i++) {
                if(number % i ==0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("Entered number -> " + number + " is a prime number!");
        }
        else
        {
            System.out.println("Entered number -> " + number + " is not a prime number!");
        }
        scanner.close();
    }
}
