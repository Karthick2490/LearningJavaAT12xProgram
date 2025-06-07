package Tasks;

import java.util.Scanner;

public class Task9_ReverseNumberUsingForloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        int number = scanner.nextInt();
        int originalNumber = number;
        int digit;
        int reversed = 0;
        for(;number!=0;number/=10)
        {
            digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Original number: " +originalNumber);
        System.out.print("Reversed number: " +reversed);

    }
}
