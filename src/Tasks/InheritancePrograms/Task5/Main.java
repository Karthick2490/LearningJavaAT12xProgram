package Tasks.InheritancePrograms.Task5;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.AnimalSound();
        System.out.println("------------");

        Dog dog = new Dog();
        dog.AnimalSound();
        dog.eat();
        dog.DogBreed();
        System.out.println("------------");

        Animal dogAnimal = new Dog();
        dogAnimal.AnimalSound();
        dogAnimal.eat();
        //dogAnimal.DogBreed(); //Parent Cant access child new methods
    }
}
