package Exercise10_ForLoop;

public class Lab102_ForLoop_Continue {
    public static void main(String[] args) {
        for(int i = 0; i <=50; i++)
        {
            if(i == 5)
            {
                System.out.println("i = " +i);
                continue;
            }
            System.out.println(i);
        }
    }
}
