package Exercise3_Java_Literals;

public class Lab029_CharacterLiterals {
    public static void main(String[] args) {
        // character literals: a-z, A-Z, !@#$%^&*()_-
        // string > "", char > ''.
        //char - single character including space
        //string - Bunch of characters
        //string > "" - double quotes.
        char A = 'a';
        char B = '1';
        char _ = ' ';
        char $ = '$';

        char newline = '\n';
        System.out.println("char \n new line");

        char tabline = '\t';
        System.out.println("tabline Print \t check");

        char backspace = '\b';
        System.out.println("Testing\b check");

        char carriagereturn = '\r';
        System.out.println("Carriage Return\r check");

        char rupees = '₹';
        System.out.println(rupees);
    }
}
