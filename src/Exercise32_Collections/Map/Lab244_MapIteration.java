package Exercise32_Collections.Map;

import java.util.*;

public class Lab244_MapIteration {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap();
        map.put("Name", "Karthick");
        map.put("Address", "Chennai");
        map.put("Phone Number", "9087812345");
        map.put(null, "0");
        map.put("Value", null);

        System.out.println(map);
        System.out.println(map.size());

        for(Map.Entry<String, Object> item : map.entrySet())
        {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}
