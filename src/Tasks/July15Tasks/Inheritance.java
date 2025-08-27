package Tasks.July15Tasks;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();
        dog.sound();
    }
}

class Animal
{
    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Dog Barks!");
    }
}