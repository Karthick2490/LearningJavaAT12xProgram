package Tasks;

public class Task10_FunctionPractice {
    public static void main(String[] args) {
        String result = PrintHelloName("World");
        System.out.println(result);
    }
    static String PrintHelloName(String name)
    {
        return "Hello " + name;
    }
}
