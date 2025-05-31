package Exercise10_ForLoop;

public class Lab100_ForLoopOdd_Even {
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even Number: " +i);
            }
        }
    }
}
