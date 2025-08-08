package Exercise32_Collections;

import java.util.*;

public class Lab228_Collections {
    public static void main(String[] args) {
        List Marks = new ArrayList<>();
        Marks.add(89);
        Marks.add(91);
        Marks.add(81);
        Marks.add(95);

        Collections.sort(Marks);
        System.out.println(Marks);

        Collections.sort(Marks,Collections.reverseOrder());
        System.out.println(Marks);
    }
}
