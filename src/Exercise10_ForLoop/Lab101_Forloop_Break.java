package Exercise10_ForLoop;

public class Lab101_Forloop_Break {
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++)
        {
            if(i==5)
            {
                System.out.println("Break at i =" +i);
                break;
            }
            System.out.println(i);
        }
    }
}
