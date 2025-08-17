package Tasks.June25Tasks;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Cars cars = new Cars("Audi", 2024);
        System.out.println(cars.getModel());
        System.out.println(cars.getYear());
    }
}

class Cars
{
    private String Model;
    private int Year;

    Cars(String model, int year)
    {
        this.Model = model;
        this.Year = year;
        System.out.println("Parameterized Constructor is called");
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }
}
