package Exercise32_Collections.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab246_HashTable {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("Name", "Karthick");
        table.put("Rollno", 1);
        //table.put(null, 23); //java.lang.NullPointerException
        //table.put("Value", null); //java.lang.NullPointerException

        Enumeration<Object> e = table.keys();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
