package Tasks.June24Tasks;

import java.util.Scanner;

public class ForWhileMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            System.out.println("Enter the number to generate multiplication table: ");
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

        System.out.println("******** For Loop ************");
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d\n", input, i, input*i);
        }

        System.out.println("******** While Loop ************");
        int multiples = 1;
        while(multiples <= 10)
        {
            System.out.printf("%d X %d = %d\n", input, multiples, input*multiples);
            multiples++;
        }
    }
}
