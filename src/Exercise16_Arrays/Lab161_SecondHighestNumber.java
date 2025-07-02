package Exercise16_Arrays;

public class Lab161_SecondHighestNumber {
    public static void main(String[] args) {
        int [] numbers = {23,12,34,45,76,87,22,99,100};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > first)
            {
                second = first;
                first = numbers[i];
            }
            else if(numbers[i] > second && numbers[i] != first)
            {
                second = numbers[i];
            }
        }
        System.out.println(second);
    }
}
