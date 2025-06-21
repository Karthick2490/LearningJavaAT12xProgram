package Assesments;

import java.util.Enumeration;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = 0;
        if(scanner.hasNextInt())
        {
            number = scanner.nextInt();
        }

        if(number == 0)
        {
            System.out.println( number + " is zero");
        }
        else if(number < 0)
        {
            System.out.println( number + " is negative");
        }
        else
        {
            System.out.println( number + " is positive");
        }

    }
}
