package Tasks.WrapperClass;

public class StringtoPrimitiveInt {
    public static void main(String[] args) {
        String value = "10";
        int result = Integer.parseInt(value);
        System.out.println("String Value: " +value);
        System.out.println("Primitive value: " +result);
        System.out.println("After adding 100: " + (result + 100));
    }
}
