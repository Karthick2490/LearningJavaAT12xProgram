package Tasks.June25Tasks;

public class DefaultConstructor {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Car
{
    private String Model;

    public Car()
    {
        Model = "Hyundai";
        System.out.println("Default Constructor is called!");
    }
}
