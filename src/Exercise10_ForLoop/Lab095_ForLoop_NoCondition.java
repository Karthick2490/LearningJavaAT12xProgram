package Exercise10_ForLoop;

public class Lab095_ForLoop_NoCondition {
    public static void main(String[] args) {
        for(int i = 0; ;i++) //No Condition
        {
            System.out.println(i); //Process finished with exit code 130 (interrupted by signal 2:SIGINT)
            //exit code 0 - Successful
        }
    }
}
