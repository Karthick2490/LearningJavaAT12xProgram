package Tasks.Assignments;

public class Task11_FunctionsPractice_Max2Integers {
    public static void main(String[] args) {
        int result = MaximumofTwoNumbers(45,90);
        System.out.println(result);
    }
    static int MaximumofTwoNumbers(int a, int b)
    {
        return Math.max(a, b);
    }
}
