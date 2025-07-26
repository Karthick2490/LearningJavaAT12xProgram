package Exercise_Interface;

import java.util.Scanner;

public class Lab187_Interface_Methods {
    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.studentsfromASection();
        schoolClass.studentsfromBsection();
    }
}
class SchoolClass implements ClassRoom1, ClassRoom2
{
    @Override
    public void studentsfromASection()
    {
        System.out.println("A section");
    }

    @Override
    public void studentsfromBsection() {
        System.out.println("B Section");
    }
}

interface ClassRoom1
{
    void studentsfromASection();
}

interface  ClassRoom2
{
    void studentsfromBsection();
}
