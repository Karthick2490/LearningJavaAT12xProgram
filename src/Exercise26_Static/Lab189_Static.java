package Exercise26_Static;

public class Lab189_Static {
    public static void main(String[] args) {
        student student1 = new student(10);
        System.out.println(student1.age);
        student student2 = new student(15);
        student.StaticMethod();
    }

}

class student
{
    int age; // Non Static, Instance variable, Attribute
    static String course_name = "Java";

    public student(int age) {
        this.age = age;
    }

    static void StaticMethod()
    {
        System.out.println("Static Method");
    }
}