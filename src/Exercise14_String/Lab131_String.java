package Exercise14_String;

public class Lab131_String {
    public static void main(String[] args) {
        String name = "Karthick"; //SCP string constant pool
        //name is pointing to karthick and cannot be changed - immutability
        name.toUpperCase();
        System.out.println(name);
    }
}
