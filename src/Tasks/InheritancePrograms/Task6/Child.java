package Tasks.InheritancePrograms.Task6;

public class Child extends Parent{

    @Override
    public void Home() {
        super.Home();
        System.out.println("Child has one Home");
    }

    public void car()
    {
        System.out.println("Audi Car");
    }
}
