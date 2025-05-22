package Exercise5_TypeCasting;

public class Lab050_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //Implicit casting - Widening
        //smaller datatype into larger datatype
        a = (int)b;// not required
        System.out.println(a);
    }
}
