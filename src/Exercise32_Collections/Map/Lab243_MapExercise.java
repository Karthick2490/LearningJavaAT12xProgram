package Exercise32_Collections.Map;

import java.util.*;

public class Lab243_MapExercise {
    public static void main(String[] args) {
        Map<String, Object> student = new HashMap<>();
        student.put("Name", "Karthick");
        student.put("Address", "Chennai");
        student.put("Phone Number", "9802312456");
        System.out.println(student);
        System.out.println("-----------");

        Map<String, Object> student2 = new LinkedHashMap<>();
        student2.put("Name", "Bharathi");
        student2.put("Address", "Chennai");
        student2.put("Phone Number", "9803212456");
        System.out.println(student2);
        System.out.println("-----------");
    }
}
