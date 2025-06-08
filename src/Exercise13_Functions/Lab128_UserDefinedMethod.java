package Exercise13_Functions;

public class Lab128_UserDefinedMethod {
    public static void main(String[] args) {
        int result = UserdefinedMethod(45, 5);
        int result1 = UserdefinedMethod(44, 23);
        System.out.println(result1);
        System.out.println(result);
    }

    static int UserdefinedMethod(int a, int b)
    {
        return a + b;
    }
}
