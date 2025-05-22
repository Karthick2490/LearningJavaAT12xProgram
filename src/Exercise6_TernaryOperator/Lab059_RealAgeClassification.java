package Exercise6_TernaryOperator;

public class Lab059_RealAgeClassification {
    public static void main(String[] args) {
        //Real age classification - If your age is less than 18, then you are a minor
        //if your age is >=18, then you are a adult
        //if your age is >65, then you are a senior citizen

        int age = 25;
        String result = age > 18? (age > 65 ? "You are a Senior Citizen" : "You are an adult")
                : "You are a minor";
        System.out.println(result);
    }
}
