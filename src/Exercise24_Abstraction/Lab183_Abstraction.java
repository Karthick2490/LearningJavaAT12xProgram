package Exercise24_Abstraction;

public class Lab183_Abstraction {
    public static void main(String[] args) {
        Son son = new Son();
        son.loan50K();
    }
}

//Abstraction can be achieved by abstract and interface
//Abstract cannot have a final keyword
//Abstract method cannot have body
//Abstract can be method and class

class ConcreteClass
{
    //Concrete class
}

abstract class Father
{
    abstract void loan50K();
}

 class Son extends Father
{

    @Override
    void loan50K() {
        System.out.println("Loan Given");
    }
}
