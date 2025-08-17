package Tasks.June24Tasks;

import java.util.Scanner;

public class Forwhile_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int factorial = 1;
        while(true)
        {
            System.out.println("Enter the number to calculate the factorial: ");
            if(scanner.hasNextInt())
            {
                input = scanner.nextInt();

                if(input < 1)
                {
                    System.out.println("Input should be a positive number!");
                    continue;
                }
                break;
            }
            else {
                System.out.println("Enter a Valid Input!");
                scanner.nextLine();
            }
        }

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }

        System.out.println("For Loop -> Factorial of " +input+ " : " +factorial);
        System.out.println("*****************************************");

        while(input <= 1)
        {
            factorial *= input;
            input--;
        }
        System.out.println("For Loop -> Factorial of " +input+ " : " +factorial);

    }
}
