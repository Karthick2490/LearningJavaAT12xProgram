package Tasks.June19Tasks;

import java.util.Scanner;

public class SmallestofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isValidFirstNumber = false;
        boolean isValidSecondNumber = false;

        while(!isValidFirstNumber) {
            System.out.println("Enter the First Number");
            if (scanner.hasNextInt()) {
                firstNumber = scanner.nextInt();
                isValidFirstNumber = true;
            }
            else {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
        }
        while(!isValidSecondNumber) {
            System.out.println("Enter the Second Number");
            if (scanner.hasNextInt()) {
                secondNumber = scanner.nextInt();
                isValidSecondNumber = true;
            }
            else {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
        }

        if(firstNumber < secondNumber)
        {
            System.out.println("Smallest Number -> " +firstNumber);
        }
        else
        {
            System.out.println("Smallest Number -> " +secondNumber);
        }
    }
}
