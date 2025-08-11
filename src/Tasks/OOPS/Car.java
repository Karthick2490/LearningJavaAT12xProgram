package Tasks.OOPS;

public class Car extends Vehicle{

    private int numberofDoors;

    public Car(String brand, int year, int numberofDoors) {
        super(brand, year);
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void DisplayMessage()
    {
        super.DisplayMessage();
        System.out.println("Number of Doors: " +numberofDoors);
    }
}
