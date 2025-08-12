package Tasks.Constructors;

public class CarClassConstructor {

    public static void main(String[] args) {
        Car car = new Car("Hyundai", "i20", 300000);
        car.DisplayCarDetails();
    }
    public static class Car
    {
        private String brand;
        private String Model;
        private int Price;

        public Car(String brand, String model, int price) {
            this.brand = brand;
            Model = model;
            Price = price;
        }

        public void DisplayCarDetails()
        {
            System.out.println("Brand Name: " +brand);
            System.out.println("Model: " +Model);
            System.out.println("Price: " +Price);
        }

    }
}
