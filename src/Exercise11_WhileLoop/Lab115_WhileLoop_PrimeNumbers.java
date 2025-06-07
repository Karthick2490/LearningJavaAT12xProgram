package Exercise11_WhileLoop;

import java.util.Scanner;

public class Lab115_WhileLoop_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit to identify Prime Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Number");
            scanner.next();
        }
        int limit = scanner.nextInt();
        int number = 2;
        while(number <= limit)
        {
            boolean isPrime = true;
            int divisor = 2;
            while(divisor <= Math.sqrt(number))
            {
                if(number%divisor == 0)
                {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if(isPrime && number > 1)
            {
                System.out.println("Prime Numbers are " +number);
            }
            number++;
        }
    }
}
