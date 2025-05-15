package Exercise2_JavaBasics_Part2;

public class Lab023_PrintF {
    public static void main(String[] args) {
        /*
        %d => int, long, short, byte
        %s => string
        %b => boolean
        %f => float, double
         */

        int a = 10, b = 20;
        System.out.printf("%d + %d = %d", a, b, a+b);
        System.out.println();
        byte c = 20, d = 5;
        System.out.printf("%d * %d = %d", c, d, c*d);
        System.out.println();
        boolean isKarthickMarried = true;
        boolean isKarthickhasMG = false;
        System.out.printf("Is Karthick Married: %b", isKarthickMarried);
        System.out.println();
        System.out.printf("Is Karthick has MG Hector: %b", isKarthickhasMG);
        System.out.println();
        String Value = "Karthick Udayakumar";
        System.out.printf("My name is %s", Value);
        float pi = 3.14f;
        System.out.println();
        System.out.printf("Value of PI is %f", pi);
    }
}
