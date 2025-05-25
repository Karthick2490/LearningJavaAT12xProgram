package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab073_IfCondition_PositiveNegativeZeroCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            if(number >0)
            {
                System.out.println("Entered number is  a Positive Number");
            }
            else if(number<0)
            {
                System.out.println("Entered number is a Negative number");
            }
            else
            {
                System.out.println("Entered number is Zero");
            }
        }
        else {
            System.out.println("Please enter a number, not text!");
        }
    }
}
