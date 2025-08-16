package Tasks.June20Tasks;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        while(true)
        {
            System.out.println("Enter the Number: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if(input < 0)
                {
                    System.out.println("Number should be positive!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a valid number!");
                scanner.nextLine();
            }
        }
        int originalNumber = input;
        int digits = String.valueOf(input).length();
        while(originalNumber != 0)
        {
            int digit = originalNumber % 10;
            sum += Math.pow(digit,digits);
            originalNumber = originalNumber/10;
        }

        if(input == sum)
        {
            System.out.println("Its a Armstrong Number");
        }
        else {
            System.out.println("Its not a Armstrong Number");
        }
    }
}
