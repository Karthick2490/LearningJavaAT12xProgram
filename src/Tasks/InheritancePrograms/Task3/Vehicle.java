package Tasks.InheritancePrograms.Task3;

public class Vehicle {
    private String Brand;

    public Vehicle(String brand) {
        Brand = brand;
    }

    public void Start()
    {
        System.out.println("The Vehicle is Starting");
    }

    public void Stop()
    {
        System.out.println("The Vehicle is Stopping");
    }

    public String getBrand() {
        return Brand;
    }
}
