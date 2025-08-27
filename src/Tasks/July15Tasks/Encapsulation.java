package Tasks.July15Tasks;

public class Encapsulation {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setModelName("Audi");
        System.out.println(vehicle.getModelName());
    }
}

class Vehicle
{
    private String modelName;
    private int year;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
