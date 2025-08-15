package Tasks.June17Tasks;

import java.util.Scanner;

public class AgeCheckforVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        while(true)
        {
            System.out.println("Enter the Age: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                break;
            }
            else
            {
                System.out.println("Enter a Valid Age!");
                scanner.nextLine();
            }
        }

        if(age >= 18)
        {
            System.out.println("You are eligible to vote!");
        }
        else {
            System.out.println("Not Eligible to Vote!");
        }
    }
}
