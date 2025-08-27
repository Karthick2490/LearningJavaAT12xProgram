package Tasks.July15Tasks;

import Tasks.InheritancePrograms.Task6.Child;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.Sum(4, 5);
        Double resultDouble = calculator.Sum(4.5, 9.0);

        System.out.println(result);
        System.out.println(resultDouble);


        Son son = new Son();
        son.Home();
    }
}

class Calculator
{
    public int Sum(int a, int b)
    {
        return a + b;
    }

    public double Sum(double a, double b)
    {
        return a + b;
    }
}

class Parent
{
    void Home()
    {
        System.out.println("2 BHK");
    }
}

class Son extends Parent
{
    @Override
    void Home() {
        System.out.println("3 BHK");
    }
}
