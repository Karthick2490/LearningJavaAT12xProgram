package Exercise25_Interface;

public class Lab185_Interface {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.StartEngine();
        car.AirCheck();
        car.BlackTyre();
        car.TyrePressure();
        car.ChangeGear();
        car.AutomaticShift();
        car.StopEngine();
    }
}

class WagonR extends Engine implements Tyre, Gear
{
    @Override
    void StartEngine() {
        System.out.println("Start the Engine");
    }

    @Override
    public void ChangeGear() {
        System.out.println("Able to Change the Gear");
    }

    @Override
    public void AutomaticShift() {
        System.out.println("Able to Shift Automatically");
    }

    @Override
    public void AirCheck() {
        System.out.println("Tyre Pressure is available");
    }

    @Override
    public void BlackTyre() {
        System.out.println("Colour is black");
    }
}

abstract class Engine
{
    abstract void StartEngine();
    void StopEngine()
    {
        System.out.println("Stop the Engine");
    }
}

interface Tyre
{
    void AirCheck();
    void BlackTyre();

    default void TyrePressure()
    {
        System.out.println("35 is present");
    }

    static void Grip()
    {
        System.out.println("Tyre Grip is available");
    }
}

interface Gear
{
    void ChangeGear();
    void AutomaticShift();
}