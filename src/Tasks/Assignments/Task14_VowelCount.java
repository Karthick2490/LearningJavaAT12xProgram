package Tasks.Assignments;

import java.util.Scanner;

public class Task14_VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = userInput(scanner, "Enter a string to find the count of Vowel");
        int result = getVowelCount(userInput);
        System.out.println("Vowel Count for " + userInput + " is " + result);
    }

    static String userInput(Scanner scanner, String promptMessage)
    {
        while(true)
        {
            System.out.println(promptMessage);
            if(scanner.hasNextLine())
            {
                String input = scanner.nextLine();
                if(!input.isEmpty())
                {
                    return input;
                }
                System.out.println("Enter a valid String");
                scanner.nextLine();
            }
        }
    }

    static int getVowelCount(String inputString)
    {
        int count = 0;
        inputString = inputString.toLowerCase();
        for(int i = 0; i < inputString.length(); i++)
        {
            char ch =  inputString.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch =='u')
            {
                count++;
            }
        }
        return count;
    }
}
