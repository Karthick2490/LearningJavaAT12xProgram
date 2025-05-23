package Tasks;

public class Task3_JavaOperators {
    public static void main(String[] args) {
        //Task 2 Guess the output:

        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        //Logic
        //c = 11 + 22 + 11 + 22 [a =12, b=23] + 13 + 24 [a=13, b = 24, c=103]

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

    }
}
