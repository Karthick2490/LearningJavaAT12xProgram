package Exercise7_IncrementDecrement;

public class Lab067_PracticeQnA3 {
    public static void main(String[] args) {
        int x = 5;
        int y = x-- + --x + x++;
        //x-- = 5, x=4
        //--x, x=3
        //x++, x=3
        System.out.println(y);
    }
}
