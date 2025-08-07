package Exercise32_Collections;

import java.util.Vector;

public class Lab226_Vector {
    public static void main(String[] args) {
        Vector V = new Vector();
        V.add("Karthick");
        V.add(1);
        V.add("Karthick");
        V.add("Kumar");
        System.out.println(V);
        V.remove("Karthick");
        System.out.println(V);
        System.out.println(V.contains("Karthick"));
    }
}
