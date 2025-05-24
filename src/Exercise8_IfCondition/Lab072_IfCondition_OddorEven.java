package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab072_IfCondition_OddorEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if(scanner.hasNextInt())
        {
            int number = scanner.nextInt();

            if(number%2 == 0)
            {
                System.out.println("Entered number is Even!");
            }
            else
            {
                System.out.println("Entered number is Odd!");
            }
        }
        else
        {
            System.out.println("Please enter a number, not the text");
        }

    }
}
