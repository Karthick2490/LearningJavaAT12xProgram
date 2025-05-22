package Exercise6_TernaryOperator;

public class Lab060_AgeclassificationFromArgs {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        String result = age > 18? (age > 65 ? "You are a Senior Citizen" : "You are an adult")
                : "You are a minor";
        System.out.println(result);

    }
}
