package Tasks.June18Tasks;

public class WhileLoopSumofNaturalNumbers {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while(number <= 10)
        {
            sum += number;
            number++;
        }
        System.out.println("Sum of first natural numbers: " +sum);
    }
}
