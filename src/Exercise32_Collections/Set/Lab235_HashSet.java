package Exercise32_Collections.Set;

import java.util.*;

public class Lab235_HashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Karthick");
        set.add("Udayakumar");
        set.add("Karthick");
        set.add(null);
        set.add(null);
        set.add("Himalayas");

        System.out.println(set);
        System.out.println(set.size());

    }
}
