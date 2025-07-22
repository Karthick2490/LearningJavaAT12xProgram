package Exercise20_Polymorphism.MethodOverloading;

public class Lab174_MethodOverloading {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.add(3,4);
        int result = mathOperations.add(3,5,7);
        double doubleresult = mathOperations.add(4.55, 98.07);
        System.out.println(result);
        System.out.println(doubleresult);
    }
}
