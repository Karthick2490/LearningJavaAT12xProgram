package Exercise31_Generics;

public class Lab219_Generics {
    public static void main(String[] args) {
        int c = sum(1,3);
        double d = sum(3.2, 5.4);
    }
    //Generics allows you to create methods, classes and interface that can work with different data type while keeping type safety
    static int sum(int a, int b)
    {
        return a + b;
    }

    static double sum (double a , double b)
    {
        return a + b;
    }

    static <T> T sum(T a, T b)
    {
        return null;
    }
}
