package Exercise16_Arrays;

import java.util.Arrays;

public class Lab149_Array_Function {
    public static void main(String[] args) {
        String [] names = new String [5];
        names[0] = "Karthick";
        names[1] = "Udayakumar";
        System.out.println(Arrays.toString(names));


        String [] toys = {"Car", "bus", "Ball"};
        System.out.println(toys.length);

        boolean [] isMarried = {true, false};
        System.out.println(isMarried[1]);

        int[] marks = {51,90,99,100,89,99};
        for(int i = 0; i < marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        //enhanced for loop
        for(int mark: marks)
        {
            System.out.println(mark);
        }
    }
}
