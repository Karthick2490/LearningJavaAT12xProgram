package Exercise6_TernaryOperator;

public class Lab057_NestedTernaryOperator {
    public static void main(String[] args) {
        //Nested ternary operator
        //If age is 18, then you can to goa
        //If age is 25, then you can to goa and drink otherwise not

        int age = 18;
        String result = age > 18 ?
                (age > 25 ? "You can go to Goa and Drink" : " You can go to Goa but cannot Drink")
                : "You cannot go to Goa";
        System.out.println(result);
    }
}
