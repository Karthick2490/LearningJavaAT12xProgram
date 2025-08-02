package Exercise28_WrapperClass;

public class Lab200_WrapperConversion {
    public static void main(String[] args) {
        String number = "10";
        Integer a = Integer.parseInt(number);
        System.out.println(a.intValue());

        Integer b = Integer.valueOf(number);
        System.out.println(b);

        String c = b.toString();
        System.out.println(c);
        System.out.println(c instanceof String);
    }
}
