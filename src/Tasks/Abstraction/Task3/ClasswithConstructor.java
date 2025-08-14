package Tasks.Abstraction.Task3;

abstract class ClasswithConstructor {
    public void PrintMessage()
    {
        System.out.println("Method from abstract class");
    }

    public ClasswithConstructor() {
        System.out.println("Abstract class constructor called");
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends  ClasswithConstructor
{
    public ConcreteClass() {
        System.out.println("Concrete class constructor called");
    }

    @Override
    public void abstractMethod()
    {
        System.out.println("Overridden Method");
    }
}

class Main
{
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod();
        concreteClass.PrintMessage();
    }
}