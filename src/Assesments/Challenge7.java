package Assesments;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        number1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        number2 = scanner.nextInt();
        System.out.println("Enter Third Number");
        number3 = scanner.nextInt();
        if(number1 > number2)
        {
            if(number1 > number3)
            {
                System.out.println("Largest number is: " +number1);
            }
        }
        else if(number2 > number3)
        {
            System.out.println("Largest number is: " +number2);
        }
        else{
            System.out.println("Largest number is: " +number3);
        }
    }
}
