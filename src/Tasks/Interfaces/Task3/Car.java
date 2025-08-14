package Tasks.Interfaces.Task3;

interface SpeedLimit
{
    int MAX_SPEED = 120;
}
public class Car {
    public void displaySpeedLimit()
    {
        System.out.println("Max Speed is: " +SpeedLimit.MAX_SPEED);
    }
}

class main
{
    public static void main(String[] args) {
        Car car = new Car();
        car.displaySpeedLimit();
    }
}
