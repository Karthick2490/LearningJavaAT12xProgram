package Exercise32_Collections.Map;

import java.util.*;

public class Lab241_Map {
    public static void main(String[] args) {

        //List, Set Map -> Interface - Object cannot be created
        Map map = new HashMap();

        //Map is a Key value pair
        //name: Karthick
        //Rollno: 1

        map.put("Name", "Karthick");
        map.put("Rollno", "1");
        map.put("Phone Number", "9876543210");

        System.out.println(map);

        Map LinkedHashMap = new LinkedHashMap();
        LinkedHashMap.put("Name", "Karthick");
        LinkedHashMap.put("Rollno", "1");
        LinkedHashMap.put("Phone Number", "9876543210");

        System.out.println(LinkedHashMap);

        Map TreeMap = new TreeMap();
        TreeMap.put("Name", "Karthick");
        TreeMap.put("Rollno", "1");
        TreeMap.put("Phone Number", "9876543210");

        System.out.println(TreeMap);

    }
}
