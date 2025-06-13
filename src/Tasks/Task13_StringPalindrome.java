package Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task13_StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Input = GetInputFromUser(scanner, "Enter a string to check whether it is palindrome or not");
        boolean isPalindrome = IsPalindromeorNot(Input);
        System.out.println( Input + " a Palindrome? - " + isPalindrome);
    }

    static String GetInputFromUser(Scanner scanner, String PromptMessage)
    {
        while (true) {
            System.out.println(PromptMessage);
            if (scanner.hasNextLine()) {
                String input = scanner.nextLine();;
                if(!input.isEmpty()) {
                    return input;
                }
            }
            System.out.println("Enter a valid string");
            scanner.nextLine();
            }
        }

    static boolean IsPalindromeorNot(String Input)
    {
        int left = 0;
        int right = Input.length() - 1;
        while(left < right)
        {
            if(Input.charAt(left++)!= Input.charAt(right--))
            {
                return false;
            }
        }
        return true;
    }
}
