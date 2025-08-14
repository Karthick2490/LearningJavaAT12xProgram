package Tasks.Interfaces.Task2;

interface Vehicle
{
    default void start()
    {
        System.out.println("Vehicle Started");
    }

    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}
public class Car implements Vehicle{

}

class main
{
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Vehicle.fuelType();
    }
}
