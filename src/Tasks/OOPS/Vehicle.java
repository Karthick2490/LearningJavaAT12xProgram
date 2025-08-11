package Tasks.OOPS;

public class Vehicle {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    private String brand;
    private int Year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        Year = year;
    }

    public void DisplayMessage()
    {
        System.out.println("Brand: " + brand + ", Year: " + Year);
    }

    public void DisplayMessage(String Owner)
    {
        System.out.println("Brand: " + brand + ", Year: " + Year + ", Owner: " + Owner);
    }

}
