package Tasks.June19Tasks;

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] number = new int [3];
        for (int i = 0; i < number.length; i++) {
            System.out.printf("Enter Number %d : ", i+1 );
            while(!scanner.hasNextInt())
            {
                System.out.println("Enter a valid input!");
                scanner.next();
                System.out.printf("Enter Number %d : ", i+1 );
            }
            number[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int smallest = number[0];
        for (int i = 0; i < number.length; i++) {
            if(number[i] < smallest)
            {
                smallest = number[i];
            }
        }
        System.out.println("Smallest Number is " +smallest);
    }
}
