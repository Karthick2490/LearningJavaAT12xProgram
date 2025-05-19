package Exercise4_JavaOperators;

public class Lab043_CompoundOperators {
    public static void main(String[] args) {
        int a = 5;
        a += 5;
        System.out.println(a);

        int b = 10;
        b *= 2 + 3;
        System.out.println(b);

        int c = 20;
        c %= 3;
        System.out.println(c);

        int e = 5;
        e *= 2 + 5 / 2;
        System.out.println(e);

        byte g = 10;
        //g = g + 1;  // Will this compile?
        g = (byte) (g + 1);
        g += 1;     // Will this compile?
    }
}
