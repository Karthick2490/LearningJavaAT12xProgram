package Tasks.Assignments;

import java.util.Scanner;

public class Task7_TriangleClassifier {
    public static void main(String[] args) {
//        ✅ Triangle Classifier:
//        Write a program that classifies a triangle based on its side lengths.
//        Given three input values representing the lengths of the sides,
//        determine if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal), or scalene (no sides are equal).
//        Use an if-else statement to classify the triangle.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Side Length:");
        int side1 = scanner.nextInt();
        System.out.println("Enter Second Side Length:");
        int side2 = scanner.nextInt();
        System.out.println("Enter Third Side Length:");
        int side3 = scanner.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("Triangle is equilateral!");
        }
        else if(side1==side2 || side2 ==side3 || side1==side3)
        {
            System.out.println("Triangle is Isosceles!");
        }
        else {
            System.out.println("Triangle is Scalene!");
        }

        scanner.close();
    }
}
