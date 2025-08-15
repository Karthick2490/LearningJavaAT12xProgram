package Tasks.June19Tasks;

import Exercise17_OOPs.FirstClass;

import java.util.Scanner;

public class Largestofthreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Second Number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the Third Number: ");
        int thirdNumber = scanner.nextInt();
        scanner.nextLine();

        if(firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            System.out.println("Largest Number -> " +firstNumber);
        }
        else if(secondNumber > thirdNumber && secondNumber > firstNumber)
        {
            System.out.println("Largest Number -> " +secondNumber);
        }
        else
        {
            System.out.println("Largest Number -> " +thirdNumber);
        }
    }
}
