package Tasks.July10Tasks.MethodOverriding;

public class EmployeeRole {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee clerk = new Clerk();
        Employee tester = new Tester();

        employee.role();
        manager.role();
        clerk.role();
        tester.role();
    }
}

class Employee
{
    public void role()
    {
        System.out.println("General Employee");
    }
}

class Manager extends Employee
{
    @Override
    public void role() {
        System.out.println("Manager");
    }
}

class Clerk extends Employee
{
    @Override
    public void role() {
        System.out.println("Clerk");
    }
}

class Tester extends Employee
{
    @Override
    public void role() {
        System.out.println("Tester");
    }
}