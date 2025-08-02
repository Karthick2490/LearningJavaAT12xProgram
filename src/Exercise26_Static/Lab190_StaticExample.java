package Exercise26_Static;

public class Lab190_StaticExample {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails("Karthick", 359890233L); // Added L for long literal
        System.out.println(studentDetails.name);
        System.out.println(studentDetails.phonenumber);
        StudentDetails.StaticMethod(); // Note: method name starts with capital S
    }
}

class StudentDetails {
    String name;
    long phonenumber;

    public StudentDetails(String name, long phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    static void StaticMethod() { // Note: method name starts with capital S
        System.out.println("Static Method");
    }
}