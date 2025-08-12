package Tasks.Constructors;

public class StudentClassConstructor {

    public static void main(String[] args) {
        Student student = new Student("Karthick", 12);
        student.DisplayMethod();
    }
    public static class Student
    {
        private String Name;
        private int Age;

        public Student(String name, int age) {
            Name = name;
            Age = age;
        }

        public void DisplayMethod()
        {
            System.out.println("Name: " + Name + ", Age: " + Age);
        }

    }
}
