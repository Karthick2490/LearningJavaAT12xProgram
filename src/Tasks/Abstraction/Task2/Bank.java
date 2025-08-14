package Tasks.Abstraction.Task2;

abstract class Bank {
    public abstract void getInterestRate();
}

class SBI extends Bank
{
    @Override
    public void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank
{
    @Override
    public void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}
