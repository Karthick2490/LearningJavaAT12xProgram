package Tasks.July10Tasks.MethodOverloading;

public class PrintData {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.printData("Karthick"));
        System.out.println(printer.printData(45));
        System.out.println(printer.printData(3.14f));
    }
}

class Printer
{
    public String printData(String Data)
    {
        return Data;
    }

    public int printData(int Data)
    {
        return Data;
    }

    public float printData(float Data)
    {
        return Data;
    }
}
