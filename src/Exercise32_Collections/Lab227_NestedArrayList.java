package Exercise32_Collections;

import java.util.*;

public class Lab227_NestedArrayList {
    public static void main(String[] args) {
        List<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Pappaya");

        List<String> Vegetables = new ArrayList<>();
        Vegetables.add("Carrot");
        Vegetables.add("Beans");
        Vegetables.add("Brinjal");

        List<String> Meat = new ArrayList<>();
        Meat.add("Chicken");
        Meat.add("Mutton");

        List<List<String>> list = new ArrayList<>();
        list.add(Fruits);
        list.add(Vegetables);
        list.add(Meat);

        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.get(1).get(1));
    }
}
