package Exercise9_Switch;

import java.util.Scanner;

public class Lab092_SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid Month Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid Month number -> 1 for January, etc");
            scanner.next();
        }
        int number = scanner.nextInt();
        switch (number)
        {
            case 12, 1, 2 -> System.out.println("Season is Winter");
            case 3, 4, 5 -> System.out.println("Season is Spring");
            case 6, 7, 8 -> System.out.println("Season is Summer");
            case 9, 10, 11 -> System.out.println("Season is Autumn");
            default -> System.out.println("Enter a valid Month. Invalid Input!");
        }
    }
}
