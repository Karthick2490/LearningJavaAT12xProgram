package Exercise32_Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Lab223_List {
    public static void main(String[] args) {
        List Fruits = List.of("Orange", "Apple", "Pappaya", "Mango", "Chiku", "Cherry");
        System.out.println(Fruits);

        List list = new ArrayList<>();
        list.add("Karthick");
        list.add("Udayakumar");
        list.add(1);
        list.add(3.14);

        System.out.println(list);
        System.out.println(list.size());
    }
}
