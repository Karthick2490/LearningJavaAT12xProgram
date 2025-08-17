package Tasks.June24Tasks;

public class ForWhileSum1to100 {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        int whilesum = 0;
        for (int i = 1; i <= number ; i++) {
            sum += i;
            System.out.println("For Loop - Sum of 1 to 100 numbers: " +sum);
        }

        int input = 1;
        while(input <= 100)
        {
            whilesum += input;
            input++;
            System.out.println("While Loop - Sum of 1 to 100 numbers: " + whilesum);
        }
    }
}
