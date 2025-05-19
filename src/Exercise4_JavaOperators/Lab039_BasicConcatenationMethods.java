package Exercise4_JavaOperators;

public class Lab039_BasicConcatenationMethods {
    public static void main(String[] args) {
        String str1 = "Karthick";
        String str2 = "Udayakumar";

        //Using + operator
        System.out.println(str1 + str2);

        //Using concat Method
        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(str1.concat(" Learning Concatenation").concat(" ").concat( str2));

        //Using StringBuilder Method
        StringBuilder s1 = new StringBuilder();
        s1.append("Karthick").append(" is").append(" Learning");
        String Output = s1.toString();
        System.out.println(Output);

        //String Join
        String Join =  String.join("-", "03","03","2025");
        System.out.println(Join);


    }
}
