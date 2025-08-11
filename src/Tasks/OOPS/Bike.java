package Tasks.OOPS;

public class Bike extends Vehicle{
    private boolean hasSideStand;

    public Bike(String brand, int year, boolean hasSideStand) {
        super(brand, year);
        this.hasSideStand = hasSideStand;
    }

    @Override
    public void DisplayMessage()
    {
        System.out.println("Bike class");
        System.out.println("Brand: " + getBrand() + ", Year: " + getYear());
        System.out.println("Has SideStand: " + hasSideStand);
    }
}
