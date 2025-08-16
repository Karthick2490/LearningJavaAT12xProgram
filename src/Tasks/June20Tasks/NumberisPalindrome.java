package Tasks.June20Tasks;

import java.util.Scanner;

public class NumberisPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int reversed = 0;
        while(true)
        {
            System.out.println("Enter a Number to check palindrome or not: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if(input < 0)
                {
                    System.out.println("Negative numbers cannot be palindromes!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a Valid number");
                scanner.nextLine();
            }
        }

        int originalNumber = input;

        while(originalNumber != 0)
        {
            int digit = originalNumber % 10;
            reversed = reversed * 10 + digit;
            originalNumber = originalNumber/10;
        }

        if(input == reversed)
        {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not a Palindrome");
        }
    }
}
