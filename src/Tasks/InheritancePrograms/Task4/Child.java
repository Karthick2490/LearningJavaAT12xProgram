package Tasks.InheritancePrograms.Task4;

public class Child extends Parent{
    Child()
    {
        System.out.println("Default Constructor - Child Class");
    }

    Child(String Message)
    {
       super(Message);
    }

    Child(int Child)
    {
        System.out.println("Child - " +Child);
    }
}
