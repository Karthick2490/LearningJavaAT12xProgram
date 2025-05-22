package Exercise5_TypeCasting;

public class Lab053_TypeCastingNarrowing {
    public static void main(String[] args) {
        int a = 300;
        byte b = (byte) a;
        System.out.println(b); //explicit conversion - Larger datatype to smaller datatype
        // data loss will be there.

    }
}
