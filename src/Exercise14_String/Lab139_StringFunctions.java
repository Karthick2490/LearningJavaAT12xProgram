package Exercise14_String;

public class Lab139_StringFunctions {
    public static void main(String[] args) {
        String s = "Karthick";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,3));
        
        char[] array = s.toCharArray();
        System.out.println(array);
        
        String text = "Karthick ";
        System.out.println(text.trim());
        
        boolean  b = " ".isBlank();
        System.out.println(b);
        
        String repeatString = "ab";
        System.out.println(repeatString.repeat(3));
        
        String equalsignorecase = "Java";
        System.out.println(equalsignorecase.equalsIgnoreCase("java"));

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
