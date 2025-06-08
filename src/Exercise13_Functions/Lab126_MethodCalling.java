package Exercise13_Functions;

public class Lab126_MethodCalling {
    public static void main(String[] args) {
        methodCalling();
        Lab126_MethodCalling method = new Lab126_MethodCalling();
        method.nonStaticMethod();
    }
    static void methodCalling()
    {
        System.out.println("Print he method");
    }

    public void nonStaticMethod()
    {
        System.out.println("Non Static Method");
    }
}
