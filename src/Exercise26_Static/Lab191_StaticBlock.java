package Exercise26_Static;

public class Lab191_StaticBlock {
    public static void main(String[] args) {
        A staticBlock = new A();
    }
}

class A
{
    static {
        System.out.println("Static block will be called once the object is initialized");
    }

    static void method()
    {
        System.out.println("Hello");
    }
}