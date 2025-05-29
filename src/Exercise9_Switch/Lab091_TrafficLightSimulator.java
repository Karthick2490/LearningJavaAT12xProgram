package Exercise9_Switch;

import java.util.Scanner;

public class Lab091_TrafficLightSimulator {
    public static void main(String[] args) {
        char c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Valid Traffic Light Color");
        c = scanner.next().charAt(0);

        switch (c)
        {
            case 'R' -> System.out.println("Red: Stop");
            case 'Y' -> System.out.println("Yellow: Caution - Prepare to stop");
            case 'G' -> System.out.println("Green: Go");
            default -> System.out.println("Invalid traffic light color");
        }
    }
}
