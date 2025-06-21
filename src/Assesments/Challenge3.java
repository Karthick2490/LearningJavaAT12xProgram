package Assesments;

public class Challenge3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean result = (a==b);
        System.out.println("a == b: " +result);
        boolean greaterthan = (a>b);
        System.out.println("a > b: " +greaterthan);
        boolean lessthan = (a<b);
        System.out.println("a < b: " +lessthan);
        boolean andOperation = ((a > b) && (a > 0));
        System.out.println("(a > b) && (a > 0): " +andOperation);
        boolean orOperation = ((a < b) || (a > 0));
        System.out.println("(a < b) || (a > 0): " +orOperation);
        System.out.println("!(a > b): " +(!(a<b)));
    }
}
