package Tasks.InheritancePrograms.Task5;

public class Dog extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("Dogs Barks: Woof! Woof!");
    }

    public void eat()
    {
        System.out.println("Dog eats Bones");
    }

    public void DogBreed()
    {
        System.out.println("German Sherperd");
    }
}
