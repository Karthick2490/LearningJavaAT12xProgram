package JavaAdditionalExercises;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int input = 0;
        if(scanner.hasNextInt())
        {
           input = scanner.nextInt();
        }

        for(int i = input; i >= 1; i--)
        {
            for(int j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
