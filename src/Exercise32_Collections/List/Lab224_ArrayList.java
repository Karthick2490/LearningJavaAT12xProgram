package Exercise32_Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab224_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1); //0 index
        list.add(3); //1
        list.add(3); //2
        list.add("Karthick"); //3
        list.add(true); //4
        list.add("Karthick"); //5 - Duplicate allowed
        list.add(null); //6 allows null

        System.out.println(list.size());
        System.out.println(list.contains("Karthick"));
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Object o : list)
        {
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
