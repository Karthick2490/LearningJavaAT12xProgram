package Tasks.June20Tasks;
import java.util.Scanner;

public class LoanEligiblity {
    public static void main(String[] args) {
        Integer age;
        Double salary;
        Integer creditScore;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the Age: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                if(age < 18)
                {
                    System.out.println("Age should be greater than 18! ");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid age!");
                scanner.nextLine();
            }
        }

        while(true)
        {
            System.out.println("Enter the Salary: ");
            if(scanner.hasNextDouble())
            {
                salary = scanner.nextDouble();
                if(salary < 0)
                {
                    System.out.println("Salary should be a positive number!");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid Salary!");
                scanner.nextLine();
            }
        }

        while(true)
        {
            System.out.println("Enter the Credit Score: ");
            if(scanner.hasNextInt())
            {
                creditScore = scanner.nextInt();
                if(creditScore < 0)
                {
                    System.out.println("Credit Score should be a positive number!");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid Credit Score!");
                scanner.nextLine();
            }
        }



        boolean loanEligibility = (age >= 18 && age <= 80) &&
                                  (salary >= 30000) && (creditScore >= 650
                                  && creditScore <= 850);

        if(loanEligibility)
        {
            System.out.println("You are eligible for a loan");
        }
        else {
            System.out.println("You are not eligible for a loan");
        }
    }
}
