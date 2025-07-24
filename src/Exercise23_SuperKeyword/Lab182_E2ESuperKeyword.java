package Exercise23_SuperKeyword;

public class Lab182_E2ESuperKeyword {
    public static void main(String[] args) {
        car car = new car();
        car.Display();
    }
}

class Vehicle
{
    int maxSpeed = 250;

    Vehicle()
    {
        System.out.println("Default Constructor");
    }

    Vehicle(String Model)
    {
        System.out.println("Parameterized Constructor");
    }

    void Message()
    {
        System.out.println("Function");
    }

    void Message(String message)
    {
        System.out.println("Function with Parameter - Method Overloading");
    }

    void Display()
    {
        System.out.println("Display the date");
    }
}

class car extends Vehicle
{
    int mazSpeed = 150;

    car()
    {
        super("Audi");
        System.out.println(super.maxSpeed);
        System.out.println(this.mazSpeed);
    }

    @Override
    void Display()
    {
        System.out.println("Car Class - Overriding");
    }
}
