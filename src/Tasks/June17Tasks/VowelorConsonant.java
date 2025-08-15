package Tasks.June17Tasks;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = '\0';

        while(true)
        {
            System.out.println("Enter a Valid Letter [a-z or A-z] : ");
            String input = scanner.nextLine().trim().toLowerCase();
            if(input.matches("^[a-zA-Z]$"))
            {
                letter = input.charAt(0);
                break;
            }
            else {
                System.out.println("Invalid Input! Please enter only one letter");
            }
        }

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
        {
            System.out.println("Entered letter " + letter + " is a Vowel");
        }
        else
        {
            System.out.println("Entered letter " + letter + " is a Consonant");
        }

        scanner.close();
    }
}
