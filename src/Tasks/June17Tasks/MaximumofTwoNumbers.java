package Tasks.June17Tasks;

import java.util.Scanner;

public class MaximumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        boolean isValidFirstNumber = false;
        int secondNumber = 0;
        boolean isValidSecondNumber = false;

        while(!isValidFirstNumber)
        {
            System.out.println("Enter first number: ");
            if(scanner.hasNextInt())
            {
                firstNumber = scanner.nextInt();
                isValidFirstNumber = true;
            }
            else {
                System.out.println("Enter a Valid Number");
                scanner.next();
            }
        }

        while(!isValidSecondNumber)
        {
            System.out.println("Enter Second number: ");
            if(scanner.hasNextInt())
            {
                secondNumber = scanner.nextInt();
                isValidSecondNumber = true;
            }
            else {
                System.out.println("Enter a Valid Number");
                scanner.next();
            }
        }

        if(firstNumber > secondNumber)
        {
            System.out.println("Maximum Number: " +firstNumber);
        }
        else {
            System.out.println("Maximum Number: " +secondNumber);
        }
        scanner.close();
    }
}
