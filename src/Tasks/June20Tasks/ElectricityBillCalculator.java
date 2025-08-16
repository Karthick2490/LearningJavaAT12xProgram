package Tasks.June20Tasks;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double units = 0;
        double electricityBill;
        while (true)
        {
            System.out.println("Enter units to calculate electricity bill: ");
            if(scanner.hasNextDouble())
            {
                units = scanner.nextDouble();
                if(units < 0)
                {
                    System.out.println("Enter a positive number!");
                    System.out.println("************************");
                    continue;
                }
                break;
            }
            else
            {
                System.out.println("Enter a positive number!");
                scanner.nextLine();
            }
        }

        if(units <=100)
        {
            electricityBill = units * 0.50;
        }
        else if (units >= 101 && units <= 200)
        {
            electricityBill = units * 0.75;
        }
        else if (units >= 201 && units <= 300)
        {
            electricityBill = units * 1.20;
        }
        else
        {
            electricityBill = units * 1.50;
        }

        System.out.println("Electricity Bill: Rs." + electricityBill);


    }
}
