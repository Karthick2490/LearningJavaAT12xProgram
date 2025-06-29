package Exercise16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab151_Array_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        String [] marks = new String[size];

        for(int i = 0; i < marks.length; i++)
        {
            System.out.println("Enter the elements -> " +i);
            marks[i] = scanner.next();
        }

        for(String mark : marks)
        {
            System.out.println(mark);
        }
    }
}
