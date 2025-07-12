package Exercise18_Constructor;

public class MainClass_ValueAssignment {
    public static void main(String[] args) {
        Lab169_Constructor_ValueAssignment car = new Lab169_Constructor_ValueAssignment();
        car.name = "MG Hector";
        car.model = "Hector plus";

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);

        //If value is not assigned, value will populate from constructor
        Lab169_Constructor_ValueAssignment nano = new Lab169_Constructor_ValueAssignment();
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
