package Exercise32_Collections.Map;

import java.util.*;

public class Lab245_MapwithinArrayList {
    public static void main(String[] args) {
        Map <String, String> student1 = new LinkedHashMap();
        student1.put("Name", "Karthick");
        student1.put("Rollno", "980");
        student1.put("Address", "Chennai");
        System.out.println(student1);

        Map student2 = new HashMap();
        student2.put("Name", "Bharathi");
        student2.put("Rollno", "981");
        student2.put("Address", "Chennai");
        System.out.println(student2);

        for(Map.Entry<String, String> item : student1.entrySet())
        {
            System.out.println(item.getKey() + "->" + item.getValue());
        }

        List list = new ArrayList();
        list.add(student1);
        list.add(student2);

        System.out.println(list);
    }
}
