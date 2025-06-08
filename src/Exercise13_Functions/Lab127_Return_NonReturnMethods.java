package Exercise13_Functions;

public class Lab127_Return_NonReturnMethods {
    public static void main(String[] args) {
        nonReturnMethod();
        String Name = ReturnsName();
        System.out.println(Name);
        boolean boolResult = result();
        byte byteResult = byteMethod();
        float floatResult = floatMethod();
        System.out.println(boolResult);
        System.out.println(byteResult);
        System.out.println(floatResult);
    }

    static void nonReturnMethod()
    {
        System.out.println("Returns Nothing");
    }

    static String ReturnsName()
    {
        System.out.println("Return Method");
        return "Karthick";
    }

    static boolean result()
    {
        return true;
    }

    static byte byteMethod()
    {
        return 125;
    }

    static float floatMethod()
    {
        return 2.4f;
    }
}
