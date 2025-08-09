package Exercise32_Collections.Set;

import java.util.*;

public class Lab237_TreeSet {
    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet();
        treeset.add(1);
        treeset.add(2);
        treeset.add(3);
        treeset.add(4);
        treeset.add(11);

        System.out.println(treeset);

        Iterator iterator = treeset.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
