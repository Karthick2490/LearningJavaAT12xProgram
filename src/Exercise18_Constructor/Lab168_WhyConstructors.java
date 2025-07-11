package Exercise18_Constructor;

public class Lab168_WhyConstructors {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
    }
}

class A{
    public A()
    {
        System.out.println("Read csv file");
        System.out.println("Open the browser");
    }
}
