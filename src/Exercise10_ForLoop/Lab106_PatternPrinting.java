package Exercise10_ForLoop;

import java.util.Scanner;

public class Lab106_PatternPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for print a right triangle pattern");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Number");
        }
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
