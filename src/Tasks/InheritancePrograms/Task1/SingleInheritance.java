package Tasks.InheritancePrograms.Task1;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Animal animal = new Animal();
        animal.sound();

        Animal animaldog = new Dog();
        animaldog.sound();
    }
    public static class Animal
    {
        public void sound()
        {
            System.out.println("The animal makes a sound");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void sound() {
            System.out.println("The dog barks: Woof! Woof!");
        }
    }
}
