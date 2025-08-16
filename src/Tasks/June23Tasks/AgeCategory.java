package Tasks.June23Tasks;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the age: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                if(age <= 0)
                {
                    System.out.println("Enter a valid age!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a valid input!");
            }
        }

        if(age <= 12)
        {
            System.out.println("Age Category: Child!");
        }
        else if(age <= 19)
        {
            System.out.println("Age Category: Teenager!");
        }
        else if(age <= 64)
        {
            System.out.println("Age Category: Adult!");
        }
        else {
            System.out.println("Age Category: Senior Citizen");
        }
    }
}
