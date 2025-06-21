package Assesments;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        int year = 0;
        System.out.println("Enter a year");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            year = scanner.nextInt();
        }

        if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println( year + " is not a leap year");
        }
    }
}
