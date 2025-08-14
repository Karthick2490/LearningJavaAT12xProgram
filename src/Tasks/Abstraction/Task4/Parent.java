package Tasks.Abstraction.Task4;

abstract class Parent {
    abstract void show();

    void Display() {
        System.out.println("Concrete Method in Abstract Class");
    }
}

    class Child extends Parent{
        void show()
        {
            System.out.println("Abstract method implemented");
        }
    }

    class main
    {
        public static void main(String[] args) {
            Parent parent = new Child();
            parent.Display();
            parent.show();
        }
    }

