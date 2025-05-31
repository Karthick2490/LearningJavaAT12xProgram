package Exercise10_ForLoop;

import java.util.Scanner;

public class Lab105_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a upper limit to find Prime numbers");
        int limit;
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        limit = scanner.nextInt();
        for(int number = 2; number <= limit; number++)
        {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(number);i++)
            {
                if(number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Prime Numbers are " +number);
            }
        }
    }
}
