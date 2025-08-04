package Exercise29_Exceptions;

public class Lab207_Throwable {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 10/a;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
