package Exercise10_ForLoop;

public class Lab096_IfandForLoop {
    public static void main(String[] args) {
        for(int age = 1; age <= 18; age ++)
        {
            if(age>15)
            {
                System.out.println("Age crossed " +age+ ", You will get a gift");
            }
            else
            {
                System.out.println("No Gift");
            }
        }
    }
}
