package Tasks.July11Tasks;

import Tasks.InheritancePrograms.Task1.SingleInheritance;

public class ProtectedModifier {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.doEat();
    }
}

class Animal
{
    protected void eat()
    {
        System.out.println("Animal is eating");
    }
}

class dog extends Animal{
    void doEat()
    {
        eat();
    }
}
