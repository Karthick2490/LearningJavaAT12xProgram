package Exercise11_WhileLoop;

public class Lab122_FindnumberofDigits {
    public static void main(String[] args) {
        int number = 1234;
        int count = 0;
        while(number!=0)
        {
            number /= 10;
            count++;
        }
        System.out.println("Count of digits: " + count);
    }
}
