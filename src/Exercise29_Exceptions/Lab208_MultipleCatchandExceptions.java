package Exercise29_Exceptions;

public class Lab208_MultipleCatchandExceptions {
    public static void main(String[] args) {
        int a = 0;
        try {
            String name = null;
            name.trim();
            int b = 100/a;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
