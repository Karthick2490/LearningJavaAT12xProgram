package Exercise11_WhileLoop;

public class Lab119_WhileLoop_ReverseaNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;
        int digit;
        while(number != 0 )
        {
            digit = number % 10;
            reversed = reversed*10 + digit;
            number/=10;
        }
        System.out.println("Reversed Number " +reversed);
    }
}
