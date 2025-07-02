package Exercise16_Arrays;

import java.util.Arrays;

public class Lab158_IterateOverArrays {
    public static void main(String[] args) {
        int [][] arrays = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i = 0; i < arrays.length; i++)
        {
            for(int j = 0; j < arrays[i].length ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
