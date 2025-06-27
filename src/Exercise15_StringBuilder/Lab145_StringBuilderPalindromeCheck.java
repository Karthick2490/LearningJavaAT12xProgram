package Exercise15_StringBuilder;

public class Lab145_StringBuilderPalindromeCheck {
    public static void main(String[] args) {

    }

    static boolean IsPalindrome(String input)
    {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
