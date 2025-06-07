package Exercise10_ForLoop;

import java.util.Scanner;

public class Lab108_LeftTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter the Valid number");
            scanner.next();
        }
        int number = scanner.nextInt();

        for(int i = number; i >=1 ; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
