package Exercise18_Constructor;

public class Lab167_Constructor {
    public static void main(String[] args) {
        baby b1 = new baby();
        baby b2 = new baby();
        baby b3; //Will not be called as object is not created. Just a object reference.
    }
}

class baby{
    String name;
    public baby()
    {
        //This is automatically called
        System.out.println("Constructor called, When object is created");
    }
}
