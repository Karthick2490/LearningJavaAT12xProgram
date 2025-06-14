package Exercise14_String;

public class Lab136_StringQnA {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("hello");
        //Comparison ==. This will check the reference location. SCP and Object Area.
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s2);

        //equals (content) -> values
        System.out.println(s5.equals(s1));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
