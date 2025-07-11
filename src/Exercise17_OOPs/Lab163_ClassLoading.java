package Exercise17_OOPs;

public class Lab163_ClassLoading {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();

        //Class Name = FirstClass
        //ObjectReference = firstClass
        //Object = new FirstClass();

        firstClass.name = "Karthick Udayakumar";
        firstClass.speak();

        FirstClass secondObject = new FirstClass();
        secondObject.walk();
        secondObject.language = "Java";
    }
}
