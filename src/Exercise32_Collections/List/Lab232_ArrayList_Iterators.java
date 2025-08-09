package Exercise32_Collections.List;

import java.util.*;

public class Lab232_ArrayList_Iterators {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Karthick");
        list.add("Bharathi");

        for(Object o : list)
        {
            System.out.println(o);
        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }
}
