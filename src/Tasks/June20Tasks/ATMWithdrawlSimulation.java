package Tasks.June20Tasks;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ATMWithdrawlSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountBalance = 10000;
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        while(true)
        {
            System.out.println("Current Balance: " +indiaFormat.format((accountBalance)));
            System.out.println("Enter the amount to withdraw or (0 to Exit)");
            if(scanner.hasNextInt())
            {
                int amounttoWithDraw = scanner.nextInt();

                if(amounttoWithDraw == 0)
                {
                    System.out.println("Thank pyou for using ATM");
                    break;
                }
                else if (amounttoWithDraw <= 0)
                {
                    System.out.println("Amount must be greater than 0!");
                }
                else if (amounttoWithDraw % 100 != 0)
                {
                    System.out.println("Amount must be a multiple of 100");
                }
                else if (amounttoWithDraw > accountBalance)
                {
                    System.out.println("Insufficient Balance!" + "Current Balance: " + indiaFormat.format(accountBalance));
                }
                else
                {
                    accountBalance = accountBalance - amounttoWithDraw;
                    System.out.println("Amount Withdrawn: " + indiaFormat.format(amounttoWithDraw));
                    System.out.println("Remaining Balance: " + indiaFormat.format(accountBalance));
                }
            }
            else {
                System.out.println("Enter a valid input!");
                scanner.next();
            }
        }
        scanner.close();
    }
}
