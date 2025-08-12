package Tasks.InheritancePrograms.Task3;

public class Bike extends Vehicle{

    private boolean IsGearVehicle;

    public Bike(String brand, boolean isGearVehicle) {
        super(brand);
        IsGearVehicle = isGearVehicle;
    }

    public void setGearVehicle(boolean gearVehicle) {
        IsGearVehicle = gearVehicle;
    }

    @Override
    public void Start()
    {
        System.out.println("Bike Started with with Self Start button");
    }

    @Override
    public void Stop()
    {
        System.out.println("Bike has Stopped");
    }

    public void IsGearedVehicle()
    {
        System.out.println("Geared Vehicle: " + IsGearVehicle);
    }
}
