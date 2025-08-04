package Exercise29_Exceptions;

public class Lab206_MultipleCatch {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 100/a;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
