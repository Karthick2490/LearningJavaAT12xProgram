package JavaAdditionalExercises;

import java.util.Arrays;

public class Arrays_AscendingOrder_Numbers {
    public static void main(String[] args) {
        int [] numbers = {0,2,54,34,8,9,90,99,1};

        for(int i = 0; i < numbers.length-1; i++)
        {
            for(int j = 0; j < numbers.length - i - 1; j++)
            {
                if(numbers[j] > numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers [j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
