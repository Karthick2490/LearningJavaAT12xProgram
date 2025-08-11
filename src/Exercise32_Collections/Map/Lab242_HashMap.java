package Exercise32_Collections.Map;

import java.util.*;

public class Lab242_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ID", "2");
        map.put("ID", 3);
        map.put("ID2", "Karthick");
        map.put("ID3", null);
        map.put(null, 100);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.containsKey("ID"));
        System.out.println(map.containsValue("Karthick"));
        System.out.println(map.get("ID"));

    }
}
