package Exercise17_OOPs;

public class Lab166_Constructor {
    String name;

    public Lab166_Constructor()
    {
        System.out.println("Default Constructor always called and only once");
        name = "Karthick";
    }
    void PrintName()
    {
        System.out.println("Hi, This is Karthick");
    }
}
