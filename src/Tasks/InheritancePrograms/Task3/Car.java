package Tasks.InheritancePrograms.Task3;

public class Car extends Vehicle{

    private int NumberofDoors;

    public Car(String brand, int numberofDoors) {
        super(brand);
        NumberofDoors = numberofDoors;
    }

    public void CarBrand()
    {
        System.out.println("Brand: " + getBrand());
    }

    public void DisplayDoors()
    {
        System.out.println("Number of Doors: " +getNumberofDoors());
    }

    @Override
    public void Start()
    {
        System.out.println("Car is Starting with a Key");
    }

    @Override
    public void Stop()
    {
        System.out.println("Car is stopping now");
    }

    public int getNumberofDoors() {
        return NumberofDoors;
    }
}
