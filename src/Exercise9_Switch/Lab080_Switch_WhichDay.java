package Exercise9_Switch;

import java.util.Scanner;

public class Lab080_Switch_WhichDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        System.out.println("Enter the Day Number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Day between 1 to 7");
            scanner.next();
        }
        day = scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Day 1 ->Monday");
                break;
            case 2:
                System.out.println("Day 2 ->Tuesday");
                break;
            case 3:
                System.out.println("Day 3 ->Wednesday");
                break;
            case 4:
                System.out.println("Day 4 ->Thursday");
                break;
            case 5:
                System.out.println("Day 5 ->Friday");
                break;
            case 6:
                System.out.println("Day 6 ->Saturday");
                break;
            case 7:
                System.out.println("Day 7 ->Sunday");
                break;
            default:
                System.out.println("Invalid Day, Please try again");
        }
    }

}
