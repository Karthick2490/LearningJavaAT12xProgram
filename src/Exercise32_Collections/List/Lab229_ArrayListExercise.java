package Exercise32_Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class Lab229_ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        for(Integer O : list)
        {
            System.out.println(6 * O);
        }
    }
}
