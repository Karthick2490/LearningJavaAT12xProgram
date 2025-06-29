package Exercise16_Arrays;

public class Lab153_ArraySumofNumbers {
    public static void main(String[] args) {
        int [] numbers = {23,44,66,78};
        int sum = 0;
        for(int i = 0; i < numbers.length;i++)
        {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
