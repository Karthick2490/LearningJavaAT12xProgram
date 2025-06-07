package Exercise11_WhileLoop;

import java.util.Scanner;

public class Lab116_WhileLoopEnterednumberisPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to find whether its prime or not");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        int number = scanner.nextInt(); //10
        if(number <= 1)
        {
            System.out.println("Number is not prime");
        }
        int divisor = 2;
        boolean isPrime = true;
        while(divisor <= Math.sqrt(number)) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
            divisor++;
        }
            if(isPrime)
            {
                System.out.println("Number is Prime");
            }
            else {
                System.out.println("Number is not prime");
            }

    }
}
