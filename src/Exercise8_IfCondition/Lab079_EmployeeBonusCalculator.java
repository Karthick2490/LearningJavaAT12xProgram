package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab079_EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Performance Rating");
        int performanceRating = 0;
        int year = 0;
        float bonus = 0;
        while(performanceRating > 3)
        {
            System.out.println("Enter a valid Performance Rating");
            scanner.next();
        }
        performanceRating = scanner.nextInt();
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Performance Rating [1 or 2 or 3");
            scanner.next();
        }
        performanceRating = scanner.nextInt();
        System.out.println("Enter the Year of Experience");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a Valid Year of Experience");
            scanner.next();
            year = scanner.nextInt();
        }
        if(performanceRating == 1)
        {
            bonus = 5000;
        }
        else if(performanceRating == 2)
        {
            bonus = 3000;
        }
        else if(performanceRating == 3)
        {
            bonus = 1000;
        }
        if(year >=5)
        {
            bonus *= 1.5F;
        }
        else if(year>=3 && year < 5)
        {
            bonus *= 1.2F;
        }
        else {
            bonus *= 1F;
        }
        System.out.println("Bonus: $" + bonus);
    }
}
