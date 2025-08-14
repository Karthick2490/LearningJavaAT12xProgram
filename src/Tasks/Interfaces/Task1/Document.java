package Tasks.Interfaces.Task1;

interface Printable
{
    void print();
    void show();
}

interface Showable
{
    void print();
    void show();
}
public class Document implements Showable,Printable{

    @Override
    public void print()
    {
        System.out.println("Printing Document");
    }
    @Override
    public void show()
    {
        System.out.println("Showing Document");
    }

}

 class main{
    public static void main(String[] args) {
        Document document = new Document();
        document.print();
        document.show();
    }
}