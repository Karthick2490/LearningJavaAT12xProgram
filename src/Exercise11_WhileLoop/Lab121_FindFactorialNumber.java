package Exercise11_WhileLoop;

public class Lab121_FindFactorialNumber {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
        int i = 1;
        if(number <=1)
        {
            System.out.println("Factorial is 1");
        }
        while(i <= number)
        {
            factorial = factorial*i;
            i++;
        }
        System.out.println("Factorial is " +factorial);
    }
}
