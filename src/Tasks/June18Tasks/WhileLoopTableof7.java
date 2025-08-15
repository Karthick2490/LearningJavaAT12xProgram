package Tasks.June18Tasks;

public class WhileLoopTableof7 {
    public static void main(String[] args) {
        int number = 7;
        int i = 1;
        System.out.println("Multiplication Table of " + number);
        while(i <= 10)
        {
            System.out.printf("%d X %d = %d\n", number, i , number * i);
            i++;
        }
    }
}
