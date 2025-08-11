package Tasks.OOPS;

public class MainMethod {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Hyundai", 2024);
        Car car = new Car("MG", 2024, 4);
        Bike bike = new Bike("Honda", 2025, true);

        Vehicle[] vehicles = {vehicle, car, bike};

        for(Vehicle v : vehicles)
        {
            v.DisplayMessage();
            System.out.println("-------------");
        }

        car.DisplayMessage("Karthick Udayakumar");
    }
}
