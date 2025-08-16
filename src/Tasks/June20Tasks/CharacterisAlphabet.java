package Tasks.June20Tasks;

import java.util.Scanner;

public class CharacterisAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        char letter;
        while(true)
        {
            System.out.println("Enter an alphabet");
            if(scanner.hasNext())
            {
                input = scanner.next();
                if(input.length() == 1)
                {
                    letter = input.charAt(0);
                    break;
                }
                else {
                    System.out.println("Enter exactly only one character!");
                }
            }
        }
        if(Character.isLetter(letter))
        {
            System.out.println("Entered character is an alphabet");
        }
        else
        {
            System.out.println("Entered character is not an alphabet");
        }

    }
}
