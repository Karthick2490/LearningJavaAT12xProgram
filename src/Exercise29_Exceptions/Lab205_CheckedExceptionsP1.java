package Exercise29_Exceptions;

public class Lab205_CheckedExceptionsP1 {
    public static void main(String[] args) {
        String name = null;
        try {
            name.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());        }
    }
}
