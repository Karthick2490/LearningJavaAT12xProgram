package Assesments;

public class Challenge5 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.5;
        int result = (a*2) + (int) (b*3) - (a - (int)(b)) ;
        System.out.println("Expression result: " + result);

        double implicitResult = a+b;
        System.out.println("Implicit Casting: " +implicitResult);

        int explicitCasting = (int) (a+b);
        System.out.println("Explicit casting: " +explicitCasting);

    }
}
