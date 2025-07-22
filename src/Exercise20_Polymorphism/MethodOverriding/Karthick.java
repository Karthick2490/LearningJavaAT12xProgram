package Exercise20_Polymorphism.MethodOverriding;

public class Karthick extends Father{

    void Garden()
    {
        System.out.println("Garden - Karthick");
    }

    @Override
    void Home()
    {
        System.out.println("Karthick - 3 BHK Home");
    }
}
