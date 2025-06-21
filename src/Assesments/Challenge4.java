package Assesments;

public class Challenge4 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original: " + a);
        ++a;
        System.out.println("Pre-Increment: " +a);

        a = a++;
        System.out.println("Post-Increment: " + a + " (returned " +a+ ")");

        --a;
        System.out.println("Pre-decrement: " +a);

        a = a--;
        System.out.println("Post-decrement: " + a + " (returned " +a+")");


    }
}
