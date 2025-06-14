package Tasks;

import java.util.Scanner;

public class Task17_TrafficLightSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = getInput(scanner, "Enter an input R/G/Y");
        String output = TrafficSimulator(input);
        System.out.println(output);
    }

    static char getInput(Scanner scanner, String promptMessage)
    {
        char ch;
        System.out.println(promptMessage);
        while(true)
        {
            String input = scanner.next().toLowerCase();
            if(input.length() == 1)
            {
                ch = input.charAt(0);
                if(ch == 'r' || ch == 'g' || ch =='y')
                {
                    return ch;
                }
            }
            System.out.println("Invalid Input, Please select R, G, Y");
        }
    }

    static String TrafficSimulator(char c)
    {
        String result =
                switch(c)
                {
                    case 'r' -> "Red, Please stop";
                    case 'g' -> "Green, You can go!";
                    case 'y' -> "Yellow. Slow down!";
                    default -> "Invalid input";
                };
        return result;
    }
}
