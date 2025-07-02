package JavaAdditionalExercises;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input");
        int input = 0;
        if(scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }
        for(int i = 0; i <= input; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
