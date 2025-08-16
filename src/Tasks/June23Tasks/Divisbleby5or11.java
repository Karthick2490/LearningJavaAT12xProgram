package Tasks.June23Tasks;

import java.util.Scanner;

public class Divisbleby5or11 {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a valid number: ");
            if(scanner.hasNextInt())
            {
                number = scanner.nextInt();
                if(number <= 0)
                {
                    System.out.println("Enter a valid number!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a valid input!");
            }
        }

        if(number % 5 == 0 && number % 11 == 0)
        {
            System.out.println("Number -> " +number+ " is divisible by both 5 and 11");
        }
        else {
            System.out.println("Number -> " +number+ " is not divisible by both 5 and 11");
        }
    }
}
