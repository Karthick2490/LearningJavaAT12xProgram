package Exercise_Interface;

public class Lab188_Interface_MulitpleInheritance {
    public static void main(String[] args) {
        son son = new son();
        son.money();
        son.Car();
        son.Bike();
        son.Home();
    }
}
class son implements Father, Mother
{

    @Override
    public void money() {
        System.out.println("Son - Money");
    }

    @Override
    public void Bike() {
        System.out.println("Mother has a Bike");
    }

    @Override
    public void Car() {
        System.out.println("Father has a Car");
    }

    @Override
    public void Home() {
        Father.super.Home();
        Mother.super.Home();
    }
}

interface Father
{
    void money();
    void Car();
    default void Home()
    {
        System.out.println("Father - Class");
    }
}

interface Mother
{
    void money();
    void Bike();
    default void Home()
    {
        System.out.println("Mother - Class");
    }
}