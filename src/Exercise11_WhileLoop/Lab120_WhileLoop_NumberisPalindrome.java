package Exercise11_WhileLoop;

import java.util.Scanner;

public class Lab120_WhileLoop_NumberisPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find whether it is palindrome or not");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        int number = scanner.nextInt();
        int original = number;
        int digit;
        int reversed = 0;
        while(number != 0)
        {
            digit = number % 10;
            reversed = reversed*10 + digit;
            number/= 10;
        }
        String result = (original == reversed)? "Enter number is a Palindrome" : "Entered Number is not a Palindrome";
        System.out.println(result);
    }
}
