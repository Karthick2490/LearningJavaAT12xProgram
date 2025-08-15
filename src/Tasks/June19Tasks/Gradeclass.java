package Tasks.June19Tasks;

import java.util.Scanner;

public class Gradeclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1999;
        while(input < 0 || input > 100)
        {
            System.out.println("Enter the mark: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if(input < 0 || input > 100)
                {
                    System.out.println("Enter a valid input. Mark should be between 0 to 100");
                }
            }
            else {
                System.out.println("Enter a valid input!");
                scanner.next();
            }
        }

        if(input >= 90)
        {
            System.out.println("A+");
        }
        else if(input >= 80)
        {
            System.out.println("A");
        }
        else if(input >= 70)
        {
            System.out.println("B");
        }
        else if(input >= 60)
        {
            System.out.println("C");
        }
        else if(input >= 50)
        {
            System.out.println("D");
        }
        else if(input >= 40)
        {
            System.out.println("E");
        }
        else {
            System.out.println("Fail");
        }
    }
}
