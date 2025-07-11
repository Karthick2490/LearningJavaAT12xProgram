package Exercise17_OOPs;

public class Lab165_Objects {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c2 = null;
        cat c3 = new cat();
        c1.running();
        c2.running(); //null pointer exception
    }
}

class cat
{
    void running (){};
}
