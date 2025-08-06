package Exercise31_Generics;

public class Lab220_Generics_P1 {
    public static void main(String[] args) {
        GenericClass G1 = new GenericClass(10);
        GenericClass G2 = new GenericClass("Karthick");
        GenericClass G3 = new GenericClass("3.14");
    }
}

class GenericClass <T>
{
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
