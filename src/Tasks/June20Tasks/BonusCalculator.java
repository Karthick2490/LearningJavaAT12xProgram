package Tasks.June20Tasks;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        double salary;
        int yearOfExperience;
        double bonus;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the Salary: ");
            if(scanner.hasNextDouble())
            {
                salary = scanner.nextDouble();
                if(salary < 0)
                {
                    System.out.println("Enter a positive number");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid input!");
                scanner.nextLine();
            }
        }

        while (true)
        {
            System.out.println("Enter the Year of Experience: ");
            if(scanner.hasNextInt())
            {
                yearOfExperience = scanner.nextInt();
                if(yearOfExperience < 0)
                {
                    System.out.println("Enter a positive number, if less than 1 year, enter 0");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid input!");
                scanner.nextLine();
            }
        }

        if(yearOfExperience < 1)
        {
            System.out.println("No Bonus! You Salary remains -> Rs. " + salary);
        }
        else if (yearOfExperience <=3) {
            bonus = (salary * 5)/100;
            System.out.println("Congratulations!!  Bonus -> 5% of the salary: Rs." +bonus);
            System.out.println("Updated Salary: Rs." + (salary+bonus));
        }
        else if (yearOfExperience <=6) {
            bonus = (salary * 10)/100;
            System.out.println("Congratulations!! Bonus -> 10% of the salary: Rs." +bonus);
            System.out.println("Updated Salary: Rs." + (salary+bonus));
        }
        else {
            bonus = (salary * 15)/100;
            System.out.println("Congratulations!! Bonus -> 15% of the salary: Rs." +bonus);
            System.out.println("Updated Salary: Rs." + (salary+bonus));
        }
    }
}
