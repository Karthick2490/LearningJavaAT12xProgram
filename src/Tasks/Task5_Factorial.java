package Tasks;

import java.util.Scanner;

public class Task5_Factorial {
    public static void main(String[] args) {
        int number = 0;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to Calculate Factorial");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Number and Not a string");
            scanner.next();
        }
        number = scanner.nextInt();;

        if(number == 0)
        {
            factorial = 1;
            System.out.printf("Factorial of %d! is %d", number, factorial);
        }
        for(int i = 1; i<=number;i++)
        {
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d! is %d", number, factorial);
    }
}
