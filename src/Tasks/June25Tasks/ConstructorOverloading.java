package Tasks.June25Tasks;

public class ConstructorOverloading {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle = new Vehicle("Audi", "Petrol");
        System.out.println(vehicle.getFuelType());
    }
}

class Vehicle
{
    private String vehicleModel;
    private String fuelType;

    public Vehicle(){
        System.out.println("Default Constructor");
    }
    public Vehicle(String vehicleModel, String fuelType)
    {
        this.vehicleModel = vehicleModel;
        this.fuelType = fuelType;
        System.out.println("Constructor Overloading");
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getFuelType() {
        return fuelType;
    }
}

