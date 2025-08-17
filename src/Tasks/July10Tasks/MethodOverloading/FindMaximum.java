package Tasks.July10Tasks.MethodOverloading;

public class FindMaximum {
    public static void main(String[] args) {
        utility utility = new utility();
        System.out.println(utility.max(45, 10));
        System.out.println(utility.max(10.5, 11.75));
        System.out.println(utility.max(45,10,33));
    }
}

class utility
{
    public int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c)
    {
        return (a > b) ? (a > c ? a : c) : (b > c? b:c);
    }

    public double max(double a, double b)
    {
        return a > b ? a : b;
    }
}
