package Tasks.June24Tasks;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            System.out.println("Enter the input to print inverted triangle");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if(input < 1)
                {
                    System.out.println("Enter a positive number!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a valid input!");
            }
        }

        for (int i = input; i >=1 ; i--)
        {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
