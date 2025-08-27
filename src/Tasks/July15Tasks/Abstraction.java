package Tasks.July15Tasks;

public class Abstraction {
    public static void main(String[] args) {
        dog dog = new dog();
        dog.Sound();
        dog.Ability();
        dog.nooflegs();
    }
}

abstract class Animals
{
    void Sound()
    {
        System.out.println("Animal Sound");
    }

    abstract void Ability();
}

class dog extends Animals implements legs
{
    @Override
    void Ability() {
        System.out.println("Dog Barks");
    }

    @Override
    public void nooflegs() {
        System.out.println("Four Legs");
    }
}

interface legs
{
    void nooflegs();
}

