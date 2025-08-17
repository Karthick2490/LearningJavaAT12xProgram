package Tasks.July10Tasks.MethodOverloading;

public class GreetUser {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Karthick");
    }
}

class Greeter
{
    public void greet()
    {
        System.out.println("Hello");
    }

    public void greet(String Name)
    {
        System.out.println("Hello, " + Name + "!");
    }
}
