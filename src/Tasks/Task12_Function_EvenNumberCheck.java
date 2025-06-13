package Tasks;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Task12_Function_EvenNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = InputFromCustomer(scanner, "Enter a number to check even or not");
        boolean result = CheckEvenNnumberorNot(input);
        System.out.println("Is the Number Even? " + result);
    }

    static int InputFromCustomer(Scanner scanner, String PromptMessage)
    {
        while(true) {
            System.out.println(PromptMessage);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Enter a valid number");
                scanner.next();
            }
        }
    }

    static boolean CheckEvenNnumberorNot(int NumbertoCheck)
    {
        return NumbertoCheck % 2 ==0;
    }


}
