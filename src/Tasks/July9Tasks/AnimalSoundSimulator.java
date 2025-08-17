package Tasks.July9Tasks;

public class AnimalSoundSimulator {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.meow();
    }
}

class Animal
{
    public void makeSound()
    {
        System.out.println("Parent Class Method");
    }
}

class Cat extends Animal
{
    public void meow()
    {
        System.out.println("Derived Class - Cat - Meows");
    }
}
