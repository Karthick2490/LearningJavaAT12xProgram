package Exercise11_WhileLoop;

public class Lab118_WhileLoop_SumofDigits {
    public static void main(String[] args) {
        int number = 1234;
        int digit;
        int sum = 0;
        while(number!=0)
        {
            digit = number % 10;
            sum = sum + digit;
            number/=10;
        }
        System.out.println("Sum of Digits: " +sum);
    }
}
