package Exercise8_IfCondition;

import java.util.Scanner;

public class Lab077_DiscountCalculator {
//    Write a Java method that calculates a discount based on the purchase amount using the following rules:
//    If the purchase amount is > $1000, apply a 20% discount.
//    If the purchase amount is > $500 but ≤ $1000, apply a 10% discount.
//    If the purchase amount is > $100 but ≤ $500, apply a 5% discount.
//    If the purchase amount is ≤ $100, no discount is applied.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int discount;
        System.out.println("Enter the Purchase Amount to know the discount %");
        while(!scanner.hasNextInt()) {
            System.out.println("Enter a valid purchase amount");
            scanner.next();
        }
        int purchaseAmount = scanner.nextInt();
        while(purchaseAmount < 0)
        {
            System.out.println("Enter a valid purchase amount");
            purchaseAmount = scanner.nextInt();
        }

        if(purchaseAmount > 1000)
        {
            discount = (purchaseAmount * 20)/100;
            System.out.println("Discounted Amount: " +discount);
        }
        else if(purchaseAmount > 500 && purchaseAmount <= 1000)
        {
            discount = (purchaseAmount * 10)/100;
            System.out.println("Discounted Amount: " +discount);
        }
        else if(purchaseAmount > 100 && purchaseAmount <=500)
        {
            discount = (purchaseAmount * 5)/100;
            System.out.println("Discounted Amount: " +discount);
        }
        else {
            System.out.println("No Discount is displayed");
        }
    }
}
