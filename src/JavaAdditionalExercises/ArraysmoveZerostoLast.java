package JavaAdditionalExercises;

import java.util.Arrays;

public class ArraysmoveZerostoLast {
    public static void main(String[] args) {
        int [] numbers = {0,11,9,0,8,90,91,0,1,2,4,0};
        int zeroPointerIndex = 0;

        for(int i = 0; i <= numbers.length-1; i++)
        {
            if(numbers[i] != 0)
            {
                numbers[zeroPointerIndex++] = numbers[i];
            }
        }
        while(zeroPointerIndex < numbers.length)
        {
            numbers[zeroPointerIndex++] = 0;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
