package Exercise2_JavaBasics_Part2;

public class Lab024_Constants {
    //constants - Final Keyword
    public static void main(String[] args) {
        final float pi = 3.14f;
        System.out.printf("Print the Constant %f", pi);

        final int age = 35;
        // age = 36; Not Valid as age is final and its a constant!
    }
}
