package Tasks.June17Tasks;

import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean isValidNumber = false;
        while(!isValidNumber)
        {
            System.out.println("Enter the Number: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                isValidNumber = true;
            }
            else
            {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
        }


        String result = (input >= 0) ? "Entered number is a positive number" : "Entered number is a negative number";
        System.out.println(result);
    }
}
