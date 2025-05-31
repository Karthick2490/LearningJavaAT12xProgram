package Exercise10_ForLoop;

public class Lab104_PrintMultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++)
        {
            int number = 2;
            System.out.printf("%d X %d = %d", number, i, number*i);
            System.out.println();
        }
    }
}
