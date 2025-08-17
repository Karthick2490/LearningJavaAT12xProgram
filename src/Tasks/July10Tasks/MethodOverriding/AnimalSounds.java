package Tasks.July10Tasks.MethodOverriding;

public class AnimalSounds {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal animal = new Animal();

        dog.sound();
        cat.sound();
        cow.sound();
        animal.sound();
    }
}

class Animal
{
    public void sound()
    {
        System.out.println("Animal Sound - Parent Class");
    }
}

class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog - Barks");
    }
}

class Cat extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cat - Meow");
    }
}

class Cow extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cow - Moo");
    }
}