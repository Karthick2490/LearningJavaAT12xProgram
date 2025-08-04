package Exercise29_Exceptions;

public class Lab209_TryCatchFinally {
    public static void main(String[] args) {
        String name = null;
        try {
            name.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally will  always get executed");
        }

    }
}
