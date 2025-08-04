package Exercise29_Exceptions;

public class Lab212_ExceptionIQ {
    public static void main(String[] args) {
        int a = 0;
        try {
            int x = 100/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed");
        }
    }
}
