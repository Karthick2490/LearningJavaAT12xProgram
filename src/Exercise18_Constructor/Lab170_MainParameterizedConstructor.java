package Exercise18_Constructor;

public class Lab170_MainParameterizedConstructor {
    public static void main(String[] args) {
        Lab_ParameterizedConstructor car = new Lab_ParameterizedConstructor();
        System.out.println(car.model);
        System.out.println(car.year);

        Lab_ParameterizedConstructor car2 = new Lab_ParameterizedConstructor("Tata Nano", 2011);
        System.out.println(car2.model);
        System.out.println(car2.year);

        Lab_ParameterizedConstructor car3 = new Lab_ParameterizedConstructor("Audi", 2011);
        System.out.println(car2.model);
        System.out.println(car2.year);

        Lab_ParameterizedConstructor car4 = new Lab_ParameterizedConstructor("Maruti");
        System.out.println(car4.model);

        //this keyword refers to the object reference.
        //this refers to car2
        //this refers to car3
    }
}
