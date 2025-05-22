package Exercise5_TypeCasting;

public class Lab052_ExplicitConversion {
    public static void main(String[] args) {
        byte b = 12;
        int a = b; //implicit conversion
        int a1 = (int) b; //explicit conversion
        System.out.println(a);
        System.out.println(a1);
    }
}
