package Exercise9_Switch;

import java.util.Scanner;

public class Lab090_CalculatorImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2,result;
        System.out.println("Enter the First Number");
        char c;
        while(!scanner.hasNextDouble())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        number1 = scanner.nextDouble();

        System.out.println("Enter the Second Number");

        while(!scanner.hasNextDouble())
        {
            System.out.println("Enter a valid number");
            scanner.next();
        }
        number2 = scanner.nextDouble();

        System.out.println("Enter the arithmetic operation [+ - * /]");
        c = scanner.next().charAt(0);

        switch(c)
        {
            case '+':
               result = number1 + number2;
               System.out.println("Result: " +number1+ " + " +number2+ " = " +result ); break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " +number1+ " - " +number2+ " = " +result ); break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " +number1+ " * " +number2+ " = " +result ); break;
            case '/':
                if(number2 == 0)
                {
                    System.out.println("Result: Infinity"); break;
                }
                else {
                    result = number1 / number2;
                    System.out.println("Result: " + number1 + " / " + number2 + " = " + result); break;
                }
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
