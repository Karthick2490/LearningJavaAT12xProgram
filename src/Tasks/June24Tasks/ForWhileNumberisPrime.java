package Tasks.June24Tasks;

import java.util.Scanner;

public class ForWhileNumberisPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            System.out.println("Enter the number to find prime or not: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();

                if(input < 1)
                {
                    System.out.println("Input should be a positive number!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a Valid Input!");
                scanner.nextLine();
            }
        }

        boolean isPrime = false;
        if(input == 1)
        {
            System.out.println("Its a not prime number");
        }
        else {
            for (int i = 2; i < Math.sqrt(input) ; i++) {
                if(input % i == 0)
                {
                    isPrime = false;
                    break;
                }
                else {
                    isPrime = true;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("Number " +input+ " is a prime number!");
        }
        else
        {
            System.out.println("Number " +input+ " is not a prime number!");
        }
    }
}
