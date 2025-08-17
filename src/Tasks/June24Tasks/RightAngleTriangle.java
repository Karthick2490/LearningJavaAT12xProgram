package Tasks.June24Tasks;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            System.out.println("Enter a number to print right angle triangle");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if(input < 0)
                {
                    System.out.println("Enter a valid number!");
                }
                break;
            }
            else {
                System.out.println("Enter a valid input!");
            }
        }

        for (int i = 1; i <= input ; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
