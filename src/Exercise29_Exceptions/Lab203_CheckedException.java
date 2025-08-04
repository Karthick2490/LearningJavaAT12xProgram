package Exercise29_Exceptions;

public class Lab203_CheckedException {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("I will be executed when there is an exception in try block");
            System.out.println(e.getMessage());        }
        System.out.println(a);
    }
}
