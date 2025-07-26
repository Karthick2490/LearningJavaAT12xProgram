package Exercise_Interface;

public class Lab186_InterfaceExample {
    public static void main(String[] args) {
        car car = new car();
        car.StartEngine();
        car.TubeTyre();
        car.TubelessTyre();
        car.HalfTank();
        car.FullTank();
        car.StopEngine();
    }
}

class car implements carEngine, FuelLevel, CarTyre
{
    @Override
    public void StartEngine()
    {
        System.out.println("Start the Engine");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop the Engine");
    }


    @Override
    public void TubelessTyre() {
        System.out.println("Tubeless Tyre");
    }

    @Override
    public void TubeTyre() {
        System.out.println("MRF");
    }

    @Override
    public void FullTank() {
        System.out.println("Full Tank - Capacity - 50 Litres");
    }

    @Override
    public void HalfTank() {
        System.out.println("Half Capacity - 25 Litres");
    }
}
interface carEngine
{
    void StartEngine();
    void StopEngine();
}

interface FuelLevel
{
    void FullTank();
    void HalfTank();
}

interface CarTyre
{
    void TubelessTyre();
    void TubeTyre();
}