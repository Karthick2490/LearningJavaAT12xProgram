package Tasks.WrapperClass;

public class Boxing_Unboxing {
    public static void main(String[] args) {
        // Autoboxing: primitive -> wrapper
        Integer wrapperInteger = 20;
        Double wrapperDouble = 3.14;
        Character wrapperCharacter = 'C';

        // Unboxing: wrapper -> primitive
        int primitiveInt = wrapperInteger;
        double primitveDouble = wrapperDouble;
        char primitiveCharacter = wrapperCharacter;

        System.out.println(wrapperCharacter);
        System.out.println(wrapperDouble);
        System.out.println(wrapperInteger);

        System.out.println(primitiveInt);
        System.out.println(primitveDouble);
        System.out.println(primitiveCharacter);
    }
}
