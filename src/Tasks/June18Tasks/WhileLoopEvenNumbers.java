package Tasks.June18Tasks;

public class WhileLoopEvenNumbers {
    public static void main(String[] args) {
        int number = 1;
        while(number <=20)
        {
            if(number % 2 == 0)
            {
                System.out.println("Even numbers -> " +number);
            }
            number++;
        }
    }
}
