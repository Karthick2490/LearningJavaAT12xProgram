package Exercise16_Arrays;

public class Lab154_SecondHighestNumber {
    public static void main(String[] args) {
        int [] numbers = {44,35,67,32,12,89,90,91};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int number: numbers)
        {
            if(number > first)
            {
                second = first;
                first = number;
            } else if (number > second && number != first) {
                second = number;
            }
        }
        System.out.println(second);

    }
}
