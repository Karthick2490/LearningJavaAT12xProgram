package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab078_ShippingCostCalculator {
//    Write a Java method that calculates shipping costs based on:
//    Weight-based cost:
//    ≤ 5 kg → $10
//    5 kg but ≤ 20 kg → $20
//    20 kg → $30
//    Distance-based surcharge:
//    For every km beyond 100 km, add $0.50 per km.

    public static void main(String[] args) {
        int weight = 0;
        int distance = 0;
        float shippingCost = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Weight to calculate shipping cost");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid weight to calculate shipping cost");
            scanner.next();
        }
        weight = scanner.nextInt();

        System.out.println("Enter the Weight to calculate distance based surge cost");
        while(!scanner.hasNextInt())
        {
            System.out.println("Enter a valid distance to calculate surge cost");
            scanner.next();
        }
        distance = scanner.nextInt();

        if(weight <= 5)
        {
            shippingCost = 10;
        }
        else if(weight > 5 && weight <= 20)
        {
            shippingCost = 20;
        }
        else
        {
            shippingCost = 30;
        }

        if(distance > 100)
        {
            shippingCost  += (distance - 100) * 0.50;
        }

        System.out.println("Total Shipping Cost: $" +shippingCost);
    }
}
