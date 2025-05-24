package Exercise7_IncrementDecrement;

public class Lab066_PracticeQnA2 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a + a++;
        //a++ = 5
        // ++a, a=7
        //a++ = 7
        //b =19
        System.out.println(b);
    }
}
