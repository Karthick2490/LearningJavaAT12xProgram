package Exercise16_Arrays;

public class Lab150_Array_MaxMin {

    public static void main(String[] args) {
        int [] array = {23,89,91,34,21,43,99,76,1};
        int result = MaximumNumberinanArray(array);
        System.out.println(result);
        int minResult = MinimumNumber(array);
        System.out.println(minResult);
    }

    static int MaximumNumberinanArray(int [] array)
    {
        int max = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

    static int MinimumNumber(int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
}
