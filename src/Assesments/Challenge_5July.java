package Assesments;

import java.util.Scanner;

public class Challenge_5July {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scanner.nextInt();
        System.out.println("Enter a divisor");
        int divisor = scanner.nextInt();
        int result = 0;

        try{
            result = input/divisor;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            if(divisor != 0) {
                System.out.println(result + " Finally Block Executed");
            }
            else
            {
                System.out.println("Cannot divide by zero Finally block executed");
            }
        }

    }
}
