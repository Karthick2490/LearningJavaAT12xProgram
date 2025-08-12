package Tasks.InheritancePrograms.Task2;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.Home();
        child.GrandParent();
        child.Parent();
        child.Child();

        GrandParent grandParent = new Child();
        grandParent.Home();
    }
    public static class GrandParent
    {
        public void Home()
        {
            System.out.println("Grand Parent - 2 BHK Home");
        }

        public void GrandParent()
        {
            System.out.println("Parent Method");
        }
    }

    public static class Parent extends GrandParent
    {
        @Override
        public void Home()
        {
            System.out.println("Parent - 3 BHK Home");
        }

        public void Parent()
        {
            System.out.println("Parent Method");
        }
    }

    public static class Child extends Parent
    {
        @Override
        public void Home()
        {
            System.out.println("Child - 4 BHK Home");
        }

        public void Child()
        {
            System.out.println("Child Method");
        }
    }
}
