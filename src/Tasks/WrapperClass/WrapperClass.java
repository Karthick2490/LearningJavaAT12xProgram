package Tasks.WrapperClass;

import java.util.ArrayList;
import java.util.*;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);

        int first = list.get(0);

        for(int number : list)
        {
            System.out.println(number);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Karthick", 45);
        map.put("Tendulkar", 10);

        for(Map.Entry<String, Integer> item : map.entrySet())
        {
            System.out.println(item.getKey() + "-> " + item.getValue());
        }
    }
}
