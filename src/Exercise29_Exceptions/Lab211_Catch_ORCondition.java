package Exercise29_Exceptions;

public class Lab211_Catch_ORCondition {
    public static void main(String[] args) {
        try {
            String s = args[0];
            int a = Integer.parseInt(s);
            int b = 100/a;
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be called by default");
        }
    }
}
