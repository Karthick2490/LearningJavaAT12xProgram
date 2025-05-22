package Exercise6_TernaryOperator;

public class Lab055_TernaryOperator {
    //If my age is 18, then I can go to Goa otherwise you are not allowed to go Goa
    public static void main(String[] args) {
        int age = 17;
        String result = age >= 18 ?  "You can go to Goa" : "You are not allowed to go goa";
        System.out.println(result);
    }
}
