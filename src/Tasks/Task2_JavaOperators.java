package Tasks;

public class Task2_JavaOperators {
    public static void main(String[] args) {
        int i = 11;

        i = i++ + ++i;
        //Logic
        //i++ = 11
        //i=12
        //++i = 13
        //i=11+13

        System.out.println(i);
    }
}
