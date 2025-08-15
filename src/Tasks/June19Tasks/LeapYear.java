package Tasks.June19Tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean isValidinput = false;
        while(!isValidinput)
        {
            System.out.println("Enter a year to check leap year: ");
            if(scanner.hasNext())
            {
                input = scanner.nextInt();
                isValidinput = true;
            }
            else {
                System.out.println("Ente a Valid input!");
                scanner.next();
            }
        }

        if(input % 4 ==0 && input % 100 != 0 || input % 400 == 0)
        {
            System.out.println("Entered year is a leap year");
        }
        else {
            System.out.println("Entered year is not a leap year");
        }
    }
}
