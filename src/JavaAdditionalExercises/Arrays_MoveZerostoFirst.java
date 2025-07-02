package JavaAdditionalExercises;

import java.util.Arrays;

public class Arrays_MoveZerostoFirst {
    public static void main(String[] args) {
            int [] numbers = {1,8,0,7,0,6,90,0,3,21,0,81,0};
            int nonZeroIndex = numbers.length - 1;

            for(int i = numbers.length - 1; i >= 0; i--)
            {
                if(numbers[i] !=0)
                {
                    numbers[nonZeroIndex--] = numbers[i];
                }
            }

            while(nonZeroIndex >=0)
            {
                numbers[nonZeroIndex--] = 0;
            }

        System.out.println(Arrays.toString(numbers));
        }
    }
