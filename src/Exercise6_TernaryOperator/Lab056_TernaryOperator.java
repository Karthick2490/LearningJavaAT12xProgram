package Exercise6_TernaryOperator;

public class Lab056_TernaryOperator {
    public static void main(String[] args) {
        //Verify number is positive or negative
        int number = 10;
        String result = number > 10? "Postive Number": "Negative Number";
        int result1 = number > 10? 1 : 2;
        System.out.println(result1);
        System.out.println(result);
    }
}
