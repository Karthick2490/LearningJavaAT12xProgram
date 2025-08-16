package Tasks.June23Tasks;

import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {
        int days = 0;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number of days: ");
            if(scanner.hasNextInt())
            {
                days = scanner.nextInt();
                if(days <= 0)
                {
                    System.out.println("Enter a valid day!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a valid input!");
            }
        }
        int years = days / 365;
        int remainingdays = days % 365;
        int months = remainingdays / 30;
        remainingdays = remainingdays % 30;

        System.out.printf("%d Years, %d Months and %d Days", years, months, remainingdays);
    }
}
