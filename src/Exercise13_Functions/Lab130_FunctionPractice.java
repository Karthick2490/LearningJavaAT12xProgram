package Exercise13_Functions;

import java.util.Scanner;

public class Lab130_FunctionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = ReadInput(scanner, "Enter a Valid Integer A");
        int b = ReadInput(scanner, "Enter a Valid Integer B");

        int Add = sum(a, b);
        int Sub = sub(a,b);
        int Div = div(a,b);
        int Mod = mod(a,b);
        int Mul = mul(a,b);

        System.out.println(Add);
        System.out.println(Sub);
        System.out.println(Div);
        System.out.println(Mod);
        System.out.println(Mul);
    }

    static int ReadInput(Scanner scanner, String PromptMessage)
    {
        System.out.println(PromptMessage);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else {
            System.out.println("Enter a valid integer");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return a/b;
    }
    static int mod (int a, int b)
    {
        return a%b;
    }
}
