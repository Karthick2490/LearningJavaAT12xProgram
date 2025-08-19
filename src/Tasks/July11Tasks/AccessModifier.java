package Tasks.July11Tasks;

public class AccessModifier {
    public static void main(String[] args) {
        System.out.println("Accessing Constructor using super keyword!");
        System.out.println("******************************************");
        Child child = new Child("Karthick", "Ayra");

        System.out.println("Accessing Child Method using super keyword");
        System.out.println("******************************************");
        ChildMethod childMethod = new ChildMethod();
        childMethod.Display();

        System.out.println("Accessing Child Variable");
        System.out.println("******************************************");
        ChildVariable childVariable = new ChildVariable();
        childVariable.ShowMessage();

        PrivateAccess privateAccess = new PrivateAccess();
        privateAccess.accessPrivateMethod();
        System.out.println("Accessing Private Variable using Public Method: " +privateAccess.PrivateMessage());

        Student student = new Student("Karthick", "35");
        student.showDetails();
    }
}
class Parent
{
    String parentName;

    public Parent(String parentName) {
        this.parentName = parentName;
        System.out.println("Parent Constructor is called with Name: " +parentName);
    }
}

class Child extends Parent
{
    String childname;
    //Calling Parent Class Constructor using Super
    public Child(String parentName, String childname) {
        super(parentName);
        this.childname = childname;
        System.out.println("Child Constructor called with Name" + childname);
    }
}

class ParentMethod
{
    public void Display()
    {
        System.out.println("Accessing Parent Method Using Super");
    }
}

class ChildMethod extends ParentMethod
{

    public void Display() {
        super.Display();
        System.out.println("Child Method Called!");
    }
}

class ParentVariable
{
    String Message = "Parent Variable";
}

class ChildVariable extends ParentVariable
{
    String Message = "Child Variable";

    void ShowMessage()
    {
        System.out.println("Parent Variable: " + super.Message);
        System.out.println("Child Variable: "  + this.Message);
    }
}

class PrivateAccess
{
    private String Message = "Message - Private Access";

    public String PrivateMessage()
    {
        return Message;
    }

    private void privateMethod()
    {
        System.out.println("Private Method Called!");
    }

    public void accessPrivateMethod()
    {
        privateMethod();
    }
}

class Student
{
    private String Name;
    private String Age;

    public Student(String name, String age)
    {
        this.Age = age;
        this.Name = name;
    }

    void showDetails()
    {
        System.out.println("Show Details - Default Access Modifier");
    }
}

class TestDefault extends Student
{
    public TestDefault(String name, String age) {
        super(name, age);
        super.showDetails();
    }
}
