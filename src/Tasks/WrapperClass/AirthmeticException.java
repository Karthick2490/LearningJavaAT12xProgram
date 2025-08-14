package Tasks.WrapperClass;

public class AirthmeticException {
    public static void main(String[] args) {
        int i = 10;
        try {
            int result = i/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
