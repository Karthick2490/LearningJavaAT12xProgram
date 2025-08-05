package Exercise29_Exceptions;

public class Lab217_FinallyNotExecuted {
    public static void main(String[] args) {
        int a = 10;
        try {
            int b = 100/a;
            System.out.println(b);
            System.exit(0); //Finally will not be executed. System.exit - JVM to exit
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Block will not be executed if you enter System.exit(0)");
        }
    }
}
