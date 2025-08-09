package Exercise32_Collections.Set;

import java.util.*;

public class Lab236_Hashset_LinkedHashset_TreeSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Watermelon");
        set.add("Apple");
        set.add("Mango");
        System.out.println(set);

        System.out.println("---------");

        Set LinkedHash = new LinkedHashSet();
        LinkedHash.add("A1");
        LinkedHash.add("A2");
        LinkedHash.add("A3");
        LinkedHash.add("A4");

        System.out.println(LinkedHash);

        System.out.println("----------");

        Set treeSet = new TreeSet<>();
        treeSet.add("Karthick");
        treeSet.add("Bharathi");
        treeSet.add("Ayra");
        //treeSet.add(1); //java.lang.ClassCastException
        // treeSet.add(null); java.lang.NullPointerException
        System.out.println(treeSet);
    }
}
