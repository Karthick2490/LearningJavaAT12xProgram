package Tasks.July10Tasks.MethodOverloading;

public class MultiplyNumbers {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.multiply(3,5));
        System.out.println(mathOperations.multiply(3,5,45));
    }
}

class MathOperations
{
    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int multiply(int a, int b, int c)
    {
        return  a * b * c;
    }
}
