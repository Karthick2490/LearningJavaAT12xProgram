package Tasks.June20Tasks;

import java.util.Scanner;

public class VisaEligiblity {
    public static void main(String[] args) {
        int age = 0;
        String visaStatus = "";
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the age: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                if(age < 0)
                {
                    System.out.println("Enter a valid age!");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a valid input!");
            }
        }

        while(true)
        {
            System.out.println("Enter the Visa Status, Input -> Valid/Invalid: ");
                visaStatus = scanner.next().trim().toLowerCase();
                if(visaStatus.equals("valid") || visaStatus.equals("invalid"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter either 'valid' or 'invalid'");
                }
        }

        if(visaStatus.equals("valid") && age >=18)
        {
            System.out.println("You are eligible to travel!");
        }
        else {
            System.out.println("You are not eligible for travel");
        }

    }
}
