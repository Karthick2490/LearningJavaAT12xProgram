package Exercise16_Arrays;

import java.util.Scanner;

public class Lab159_LeftTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input");
        int input = 0;
        if(scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }
        for(int i = input; i >= 0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
