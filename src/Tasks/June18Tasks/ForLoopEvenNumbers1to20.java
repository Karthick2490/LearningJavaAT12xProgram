package Tasks.June18Tasks;

public class ForLoopEvenNumbers1to20 {
    public static void main(String[] args) {
        int number = 20;
        for (int i = 1; i <= number ; i++) {
            if(i % 2 == 0)
            {
                System.out.println("Even Numbers -> " + i);
            }
        }
    }
}
