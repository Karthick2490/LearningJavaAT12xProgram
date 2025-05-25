package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab074_IfCondition_LargestofThreenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Please enter the number, Text is not supported");
            scanner.next();
        }
        int number1 = scanner.nextInt();

        System.out.println("Enter the Second Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Please enter the number, Text is not supported");
            scanner.next();
        }
        int number2 = scanner.nextInt();

        System.out.println("Enter the Third Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Please enter the number, Text is not supported");
            scanner.next();
        }
        int number3 = scanner.nextInt();

        if(number1 > number2 && number1 > number3)
        {
            System.out.println("Largest Number is " +number1);
        }
        else if(number2 > number3 && number2 > number1)
        {
            System.out.println("Largest Number is " +number2);
        }
        else{
            System.out.println("Largest Number is " +number3);
        }

    }
}
