package Exercise29_Exceptions;

import java.util.Scanner;

public class Lab210_FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 100;
        int divisor = scanner.nextInt();
        try {
            int result = number/divisor;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
