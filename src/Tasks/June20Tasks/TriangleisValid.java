package Tasks.June20Tasks;

import java.util.Scanner;

public class TriangleisValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] sides = new int[3];

        for (int i = 0; i < sides.length; i++)
        {
            while(true)
            {
                System.out.println("Enter the Side " + (i+1) + ": ");
                if(scanner.hasNextInt())
                {
                    sides[i] = scanner.nextInt();
                    if(sides[i] > 0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Side must be a positive number!");
                    }
                }
                else {
                    System.out.println("Must be an integer!");
                    scanner.nextLine();
                }
            }
        }

        boolean validTriangle = sides[0] + sides[1] > sides[2] &&
                                sides[1] + sides[2] > sides[0] &&
                                sides[2] + sides[0] > sides[1];

        System.out.println(validTriangle ? "Valid Triangle" : "Invalid Triangle");
    }
}
