package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab079_EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int rating;
        float bonus = 0;
        System.out.println("Enter the Performance Rating");
        while(true)
        {
            if(scanner.hasNextInt())
            {
                rating = scanner.nextInt();
                if(rating >= 1 && rating <= 3)
                {
                    break;
                }
                else {
                    System.out.println("Enter a Valid Performance Rating between 1 to 3");
                }
            }
            else {
                System.out.println("Please check your input and enter a valid performance Rating");
            }
        }
        System.out.println("Enter the Year of Service");
        while(true)
        {
            if(scanner.hasNextInt())
            {
                year = scanner.nextInt();
                if(year >=0)
                {
                    break;
                }
                else {
                    System.out.println("Enter a Valid Year of service");
                }
            }
            else {
                System.out.println("Please check your input and enter a valid year of Service");
            }
        }

        if(rating == 1)
        {
            bonus = 5000;
        }
        else if(rating == 2)
        {
            bonus = 3000;
        }
        else
        {
            bonus = 1000;
        }

        if(year >=5)
        {
            bonus *= 1.5F;
        }
        else if(year >=3){
            bonus *= 1.2F;
        }
        else
        {
            bonus *= 1F;
        }
        System.out.println("Bonus: $" +bonus);
    }
}