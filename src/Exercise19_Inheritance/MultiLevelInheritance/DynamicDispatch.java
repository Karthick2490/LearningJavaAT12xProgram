package Exercise19_Inheritance.MultiLevelInheritance;

public class DynamicDispatch {
    public static void main(String[] args) {

        GrandFatherClass grandFatherClass = new FatherClass();
        GrandFatherClass grandFatherClass1 = new SonClass();

        FatherClass father = new SonClass();
        //SonClass son = new FatherClass();

        SonClass son = new SonClass();
        son.Fathercars();
        son.GrandFatherCars();
        son.FatherProperty();
        son.GrandFatherProperty();
        son.Property();
        son.Cars();


    }
}
