package Tasks.InheritancePrograms.Task3;

public class MainClass {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda", true);
        bike.Start();
        bike.Stop();
        bike.IsGearedVehicle();

        Car car = new Car("Audi", 4);
        car.Start();
        car.Stop();
        car.DisplayDoors();

        Vehicle vehicle1 = new Car("MG Hector", 4);
        vehicle1.getBrand();
        vehicle1.Start();
        vehicle1.Stop();

        Vehicle vehicle2 = new Bike("TVS", false);
        vehicle2.Start();
        vehicle2.Stop();
    }
}
