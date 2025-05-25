package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab075_LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Year, Not Text");
            scanner.next();
        }
        year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0)
        {
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }

    }
}
