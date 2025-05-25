package Tasks;

import java.util.Scanner;

public class Task4_NumberofDaysinamonth {
    public static void main(String[] args) {
        //Write a Java program that takes a month number (1-12)
        // and prints the number of days in that month using a switch statement.
        // Handle February separately for leap years.

        Scanner scanner = new Scanner(System.in);
        int monthNumber = 0;
        int year = 0;

        // Validate month input
        System.out.println("Enter a month number e.g 1 > Jan, 2 > Feb, etc..");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer between 1-12.");
            scanner.next(); // consume the invalid input
        }
        monthNumber = scanner.nextInt();

        // Validate year input
        System.out.println("Enter the year");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid year as an integer.");
            scanner.next(); // consume the invalid input
        }
        year = scanner.nextInt();
            switch(monthNumber) {
                case 1:
                    System.out.println("1 > January Month - 31 days");
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println("2 > February Month - 29 days [Leap Year] ");
                    } else {
                        System.out.println("2 > February Month - 28 Days");
                    }
                    break;
                case 3:
                    System.out.println("3 > March Month - 31 days");
                    break;
                case 4:
                    System.out.println("April > April Month - 30 days");
                    break;
                case 5:
                    System.out.println("5 > May Month - 31 days");
                    break;
                case 6:
                    System.out.println("6 > June Month - 30 days");
                    break;
                case 7:
                    System.out.println("7 > July Month - 31 days");
                    break;
                case 8:
                    System.out.println("8 > August Month - 31 days");
                    break;
                case 9:
                    System.out.println("9 > September Month - 30 days");
                    break;
                case 10:
                    System.out.println("10 > October Month - 31 days");
                    break;
                case 11:
                    System.out.println("11 > November Month - 30 days");
                    break;
                case 12:
                    System.out.println("12 > December Month - 31 days");
                    break;
                default:
                    System.out.println("Enter a valid month number");
            }
    }
}
