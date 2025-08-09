package Exercise32_Collections.List;

import java.util.*;

public class Lab234_List_ClassObject {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Karthick");
        Student student2 = new Student(2, "Bharathi");

        List<Student> mystudents = new ArrayList<>();
        mystudents.add(student1);
        mystudents.add(student2);

        System.out.println(mystudents);

        student1.PrintDetails();
        student2.PrintDetails();
    }

    public static class Student {

        private String Name;
        private int rollNo;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            Name = name;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "Name='" + Name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }

        public void PrintDetails()
        {
            System.out.println("Student Name is :" + this.Name);
            System.out.println("Student Rollno is :" + this.rollNo);
        }
    }
}
