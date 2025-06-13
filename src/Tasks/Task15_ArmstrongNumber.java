package Tasks;

import java.util.Scanner;

public class Task15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = userInput(scanner, "Enter a number to find armstrong or not");
        boolean result = isArmstrong(input);
        System.out.println("Is entered number a Armstrong number? " + result);
    }

    static int userInput(Scanner scanner, String promptMessage)
    {
        System.out.println(promptMessage);
        while (true)
        {
            if(scanner.hasNextInt())
            {
                int number = scanner.nextInt();
                if(number >= 0)
                {
                    return number;
                }
                System.out.println("Enter a valid number");
                scanner.next();
            }
        }
    }

    static boolean isArmstrong(int number)
    {
        int sum = 0;
        int originalNumber = number;
        int digits = String.valueOf(number).length();
        while(number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /=10;
        }
        return  sum == originalNumber;
    }
}
