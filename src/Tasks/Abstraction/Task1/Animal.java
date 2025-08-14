package Tasks.Abstraction.Task1;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Dog Barks - Woof! Woof!");
    }
}

class Cat extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Cat - Meows");
    }
}
