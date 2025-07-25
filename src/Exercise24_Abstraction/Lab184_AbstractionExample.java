package Exercise24_Abstraction;

public class Lab184_AbstractionExample {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.Drive();
    }
}

class WagonR extends Engine
{
    @Override
    void StartEngine()
    {
        System.out.println("Startjng the Engine");
    }

    void Drive()
    {
        StartEngine();
        StopEngine();
    }
}

abstract class Engine
{
    abstract void StartEngine();
    void StopEngine()
    {
        System.out.println("Stop the engine");
    }
}