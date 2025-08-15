package Tasks.June17Tasks;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean isValidNumber = false;
        while(!isValidNumber)
        {
            System.out.println("Enter the number to check even or odd");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();
                isValidNumber = true;
            }
            else {
                System.out.println("Enter a valid number to check even or odd!");
                scanner.next();
            }
        }

        String result = (input % 2 == 0) ? "Entered Number is Even" : "Entered Number is Odd";
        System.out.println(result);
    }
}
