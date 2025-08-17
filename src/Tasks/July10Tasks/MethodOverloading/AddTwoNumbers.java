package Tasks.July10Tasks.MethodOverloading;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(45, 10));
        System.out.println(calculator.add(3.50, 7.75));
    }
}

class Calculator
{
    public int add(int a, int b)
    {
        return  a + b;
    }

    public double add(double a, double b)
    {
        return a + b;
    }
}
