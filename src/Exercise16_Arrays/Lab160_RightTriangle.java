package Exercise16_Arrays;

import java.util.Scanner;

public class Lab160_RightTriangle {
    public static void main(String[] args) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt())
        {
            input = scanner.nextInt();
        }

        for(int i = 0; i <= input; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
