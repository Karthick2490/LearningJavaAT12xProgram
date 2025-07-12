package Exercise19_Inheritance.MultipleInheritance_NotPossible;

public class Lab172_MultipleInheritance {
    public static void main(String[] args) {
        SonClass son = new SonClass();
        //son.money() ??? JVM will get confused here.
        //Which money should take father 1 or father 2
    }
}
