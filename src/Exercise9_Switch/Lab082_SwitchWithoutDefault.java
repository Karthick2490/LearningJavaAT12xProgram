package Exercise9_Switch;

import java.util.Scanner;

public class Lab082_SwitchWithoutDefault {
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
        }
    }
}
