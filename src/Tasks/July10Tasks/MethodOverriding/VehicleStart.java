package Tasks.July10Tasks.MethodOverriding;

public class VehicleStart {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        car.start();
    }
}

class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle Started");
    }
}

class Bike extends Vehicle
{
    @Override
    public void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle
{
    @Override
    public void start() {
        System.out.println("Turn the key to start the car");
    }
}