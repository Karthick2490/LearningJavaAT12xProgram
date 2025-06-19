package Exercise14_String;

public class Lab138_StringSubsequence {
    public static void main(String[] args) {
        CharSequence string = "Karthick".subSequence(1,4);
        System.out.println(string);

        CharSequence str = "Karthick".subSequence(0,4);
        System.out.println(str);
    }
}
