package Exercise19_Inheritance.MultiLevelInheritance;

public class MainClass {
    public static void main(String[] args) {
        SonClass son = new SonClass();
        son.Fathercars();
        son.GrandFatherCars();
        son.FatherProperty();
        son.GrandFatherProperty();
        son.Property();
        son.Cars();

        //Multi level inheritance
    }
}
