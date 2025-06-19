package Exercise14_String;

public class Lab140_StringQnA {
    public static void main(String[] args) {
        String text = "Java";
        char ch = text.charAt(2);
        System.out.println(ch);
        System.out.println(text.codePointAt(0));

        String index = "Java";
        System.out.println(index.indexOf("a"));
        System.out.println(index.lastIndexOf("a"));

        String joinString = String.join("z-","Java", "Python");
        System.out.println(joinString);

        String replaceString = "Java";
        String result = replaceString.replace('a', 'o');
        System.out.println(result);

        boolean startsWith = "Java".startsWith("Ja");
        System.out.println(startsWith);
    }
}
