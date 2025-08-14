package Tasks.Abstraction.Task2;

public class Main {
    public static void main(String[] args) {
        Bank SBI = new SBI();
        Bank HDFC = new HDFC();

        SBI.getInterestRate();
        HDFC.getInterestRate();
    }
}
